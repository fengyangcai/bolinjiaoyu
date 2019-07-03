package cn.bolinjiaoyu.manage.service.impl.customerinformation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bolinjiaoyu.manage.mapper.CustomerInformationMapper;
import cn.bolinjiaoyu.manage.mapper.DictMapper;
import cn.bolinjiaoyu.manage.pojo.base.Dict;
import cn.bolinjiaoyu.manage.pojo.base.DictExample;
import cn.bolinjiaoyu.manage.pojo.base.DictExample.Criteria;
import cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformation;
import cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformationExample;
import cn.bolinjiaoyu.manage.service.customerinformation.CustomerInformationService;

/**
 * @author Administrator
 *
 */
@Service
public class CustomerInformationServiceImpl  implements CustomerInformationService{

	@Autowired
	private CustomerInformationMapper customerInformationMapper;
	
	
	@Autowired
	private DictMapper dictMapper;


	private cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformationExample.Criteria createCriteria2;


	public void saveSelective(CustomerInformation customerInformation) {
		//同一个手机用户，如果从不同平台来就存入，如果是从相同的平台来就更新
		
			// 拿到鏈接判斷是哪個平台
				String sourceLink = customerInformation.getSourceLink();
				//在字典表中查询parentId为1的即为平台表
				DictExample dictExample = new DictExample();
				Criteria createCriteria = dictExample.createCriteria();
				createCriteria.andParentidEqualTo(1L);
				 List<Dict> listDict = dictMapper.selectByExample(dictExample);
				if (!listDict.isEmpty()&&listDict.size()>=1) {
					for (int i = 0; i < listDict.size(); i++) {
						int indexOf = sourceLink.indexOf(listDict.get(i).getProperty());
						if (indexOf!=-1) {
							//说明包含这个子窜
							customerInformation.setFromPlatform(listDict.get(i).getName());
							break;
						}
					}
				}
				
				//查询号码和平台是否数据库是否存在存在的话就只更新不插入
				CustomerInformationExample customerInformationExample = new CustomerInformationExample();
				 cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformationExample.Criteria createCriteria2 = customerInformationExample.createCriteria();
				createCriteria2.andFromPlatformEqualTo(customerInformation.getFromPlatform());
				createCriteria2.andCustomerPhoneEqualTo(customerInformation.getCustomerPhone());
				List<CustomerInformation> customerList = customerInformationMapper.selectByExample(customerInformationExample);
				if (!customerList.isEmpty()&&customerList.size()>0) {
					//证明是有用户已在的了。只更新数据
					customerInformation.setUpdateTime(new Date());
					customerInformationMapper.updateByExampleSelective(customerInformation, customerInformationExample);
					
				}
															
		
					customerInformation.setUpdateTime(new Date()); 
		
		
					customerInformation.setStatus(0);
		
		customerInformationMapper.insertSelective(customerInformation);
		
		
		
	}

	@Override
	public CustomerInformation queryById(Serializable id) {
		
		CustomerInformation customerInformation = customerInformationMapper.selectByPrimaryKey((Integer) id);
		return customerInformation;
	}

	@Override
	public List<CustomerInformation> queryAll() {
		
		return null;
	}

	@Override
	public Integer queryCountByWhere(CustomerInformation t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerInformation> queryListByWhere(CustomerInformation t) {
	
		return null;
	}

	@Override
	public List<CustomerInformation> queryListByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSelective(CustomerInformation t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerInformation> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}



	


}
