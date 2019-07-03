package cn.bolinjiaoyu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.bolinjiaoyu.pojo.CustomerInformation;
import cn.bolinjiaoyu.service.customerinformation.CustomerInformationService;
import cn.bolinjiaoyu.vo.DataGridResult;

@Controller
@RequestMapping("/customerInfromation")
public class CustomerInformationController {
	private static  Logger log =Logger.getLogger(CustomerInformationController.class);

	@Autowired
	private CustomerInformationService customerInformationService;

	private static Map<String, Object> map =new HashMap<String, Object>();
	@RequestMapping(value = "/insertCustomerInfromation", method =RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> insertCustomerInformation( CustomerInformation customerInformation) {
		
		
		
		System.out.println("年龄段："+customerInformation.getAgeGroups());
		System.out.println("手机号码："+customerInformation.getCustomerPhone());
		System.out.println("姓名："+customerInformation.getCustomerName());
		System.out.println("学历："+customerInformation.getEducationNow());
		System.out.println("来自的平台："+customerInformation.getFromPlatform());
		System.out.println("来自的链接："+customerInformation.getSourceLink());
		System.out.println("----------");

		try {

			customerInformationService.saveSelective(customerInformation);
			map.put("code", "success");
			return ResponseEntity.ok(map);
		} catch (Exception e) {
				log.debug("CustomerInformationController出现问题");
			e.printStackTrace();
		}
		// 返回500
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}
	@RequestMapping("/getCustomerBycustomer")
	public ResponseEntity<DataGridResult> getDataGridResult(Integer rows,Integer page,CustomerInformation  cust){
		
		try {
			List<CustomerInformation> listByPage = customerInformationService.queryListByCustomer(page, rows, cust);
			Long total = (long) listByPage.size();
			DataGridResult result = new DataGridResult(total, listByPage);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		
		
		
		
	}
	
	@RequestMapping("getAllCustomers")
	public ResponseEntity<DataGridResult> getDataGridResult(HttpServletResponse httpServletResponse){
		httpServletResponse.setHeader("Access-Control-Allow-Origin","*");
		httpServletResponse.setHeader("Access-Control-Allow-Methods","POST");
		httpServletResponse.setHeader("Access-Control-Allow-Headers","Access-Control");
		httpServletResponse.setHeader("Allow","POST");
		/*
		 * Access-Control-Allow-Origin:| * // 授权的源控制 Access-Control-Max-Age:// 授权的时间
		 * Access-Control-Allow-Credentials: true | false // 控制是否开启与Ajax的Cookie提交方式
		 * Access-Control-Allow-Methods:[,]* // 允许请求的HTTP Method
		 * Access-Control-Allow-Headers:[,]* // 控制哪些header能发送真正的请求
		 */		
		try {
			List<CustomerInformation> list = customerInformationService.queryAll();
			Long total = (long) list.size();
			DataGridResult result = new DataGridResult(total, list);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("查询所有出错");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		
	}
	//excel
	@RequestMapping("/InputExcel")
	@ResponseBody
	public String inputExcel(@RequestParam("file")MultipartFile file,HttpServletRequest request) {
		
		return null;
	}
	
	@RequestMapping(value = "/OutputExcel.do", produces = "application/form-data; charset=utf-8")
	@ResponseBody
	public String OutputExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		return null;
	}

	
	
	
	
	

}
