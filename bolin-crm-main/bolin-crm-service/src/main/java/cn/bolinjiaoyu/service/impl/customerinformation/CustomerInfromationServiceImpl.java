package cn.bolinjiaoyu.service.impl.customerinformation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.bolinjiaoyu.mapper.customerinformation.CustomerInfromationMapper;
import cn.bolinjiaoyu.mapper.dict.DictMapper;
import cn.bolinjiaoyu.pojo.CustomerInformation;
import cn.bolinjiaoyu.service.customerinformation.CustomerInformationService;
import cn.bolinjiaoyu.service.impl.base.BaseServiceImpl;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class CustomerInfromationServiceImpl extends BaseServiceImpl<CustomerInformation> implements CustomerInformationService {

	@Autowired
	private CustomerInfromationMapper customerInformationMapper;

	@Autowired
	private DictMapper dictMapper;

	public void saveSelective(CustomerInformation customerInformation) {
		
		
		
			// 同一个手机用户，如果从不同平台来就存入，如果是从相同的平台来就更新

			// 拿到鏈接判斷是哪個平台
		/*
		 * String sourceLink = customerInformation.getSourceLink(); //
		 * 在字典表中查询parentId为1的即为平台表 Example dictExample = new Example(Dict.class);
		 * Criteria criteria = dictExample.createCriteria();
		 * criteria.andEqualTo("parentId", 1); //空指针 List<Dict> listDict =
		 * dictMapper.selectByExample(dictExample); if (!listDict.isEmpty() &&
		 * listDict.size() >= 1) { for (int i = 0; i < listDict.size(); i++) { //空指针异常
		 * int indexOf = sourceLink.indexOf(listDict.get(i).getProperty()); if (indexOf
		 * != -1) { // 说明包含这个子窜
		 * customerInformation.setFromPlatform(listDict.get(i).getName()); break; } } }
		 */

			// 查询号码和平台是否数据库是否存在存在的话就只更新不插入
			//CustomerInformationExample customerInformationExample = new CustomerInformationExample();
			//cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformationExample.Criteria createCriteria2 = customerInformationExample.createCriteria();
			//createCriteria2.andFromPlatformEqualTo(customerInformation.getFromPlatform());
			//createCriteria2.andCustomerPhoneEqualTo(customerInformation.getCustomerPhone());
			Example customerInformationExample = new Example(CustomerInformation.class);
			Criteria criteria2 = customerInformationExample.createCriteria();
			criteria2.andEqualTo("fromPlatform",customerInformation.getFromPlatform());
			criteria2.andEqualTo("customerPhone", customerInformation.getCustomerPhone());
			
			List<CustomerInformation> customerList = customerInformationMapper.selectByExample(customerInformationExample);
			if (!customerList.isEmpty() && customerList.size() > 0) {
				// 证明是有用户已在的了。只更新数据
				for (int i = 0; i < customerList.size();i++) {
					CustomerInformation customerInformation2 = customerList.get(i);
					customerInformation.setCustomerId(customerInformation2.getCustomerId());
					customerInformation.setUpdateTime(new Date());
					
					System.out.println("该用户已存在");
					customerInformationMapper.updateByPrimaryKeySelective(customerInformation);
					//找到一个
					break;
				}
				return;
			}

			customerInformation.setUpdateTime(new Date());

			customerInformation.setStatus(0);

			customerInformationMapper.insertSelective(customerInformation);
		}

	/*
	 * @Override public List<CustomerInformation> queryListByPage(Integer page,
	 * Integer rows, CustomerInformation cust) {
	 * 
	 * PageHelper.startPage(page, rows); List<CustomerInformation> list =
	 * customerInformationMapper.selectAll();
	 * 
	 * 
	 * return list; }
	 */

	@Override
	public List<CustomerInformation> queryListByCustomer(Integer page, Integer rows, CustomerInformation cust) {
		PageHelper.startPage(page, rows);
		List<CustomerInformation> list = customerInformationMapper.select(cust);
		return list;
	} 
	
	
 
	
	
}
