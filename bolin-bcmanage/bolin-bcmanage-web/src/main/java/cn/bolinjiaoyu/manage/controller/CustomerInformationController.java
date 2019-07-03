package cn.bolinjiaoyu.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.bolinjiaoyu.manage.pojo.customerinformation.CustomerInformation;
import cn.bolinjiaoyu.manage.service.customerinformation.CustomerInformationService;

@Controller
@RequestMapping("/customerInfromation")
public class CustomerInformationController {

	@Autowired
	private CustomerInformationService customerInformationService;


	@RequestMapping(value = "/insertCustomerInfromation", method = RequestMethod.POST)
	public ResponseEntity insertCustomerInformation(CustomerInformation customerInformation) {

		

		System.out.println(customerInformation.getAgeGroups());
		System.out.println(customerInformation.getCustomerPhone());
		System.out.println(customerInformation.getCustomerName());
		System.out.println(customerInformation.getEducationNow());
		System.out.println(customerInformation.getFromPlatform());
		System.out.println("----------");

		try {

			customerInformationService.saveSelective(customerInformation);
			return ResponseEntity.ok(null);
		} catch (Exception e) {

			e.printStackTrace();
		}
		// 返回500
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}

}
