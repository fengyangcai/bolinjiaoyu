package cn.bolinjiaoyu.service.customerinformation;

import java.util.List;

import cn.bolinjiaoyu.pojo.CustomerInformation;
import cn.bolinjiaoyu.service.base.BaseService;

public interface CustomerInformationService extends BaseService<CustomerInformation> {

	//List<CustomerInformation> queryListByPage(Integer page, Integer rows, CustomerInformation cust);

	List<CustomerInformation> queryListByCustomer(Integer page, Integer rows, CustomerInformation cust);
	


}
