package cn.bolinjiaoyu.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bolinjiaoyu.service.redis.RedisService;
import cn.bolinjiaoyu.utils.SendSmsByaliUtils;
import cn.bolinjiaoyu.utils.YanZhengMa;

@Controller
@RequestMapping("/autoCode")
public class AuthentCode {

	
	  @Autowired 
	  private RedisService redisService;
	 
	
	final static HashMap<String, Object> map =new HashMap<String,Object>();
	static String code4=null;
	
	@RequestMapping(value = "/getCode",method = RequestMethod.POST )
	public ResponseEntity getCode(@RequestParam(value ="customerPhone",required = true) String customerPhone){
		
		try {
			//查一下有没有存在的了
			 code4 = redisService.get(Ssstring.CODE+customerPhone);
			if (code4!=null) {
				redisService.del(code4);
			}
			
			//调用短信平台發送短信,发送给阿里云短信平台的00开始短信平台会自动去掉所以生成的验证码开头没有00.
			//所以这个工具类的开头不为0
			code4 = YanZhengMa.getCode4();
			
			
			
			SendSmsByaliUtils.sendSms(customerPhone, code4);
			
			//
			redisService.setex(Ssstring.CODE+customerPhone, 5*60, code4);
					
			
			//Map map =new HashMap<String,String>();
			map.put("ma", code4);
			
			//测试
			//map.put("ceshicode","0015");
			 return  ResponseEntity.ok(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//返回500
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		
	}
	
	//验证成功.返回{"suceess":"true",200}
	/*
	 * @RequestMapping(value = "/auth/{code}" ,method = RequestMethod.GET) public
	 * ResponseEntity<Map> autheCode(@PathVariable(value = "code")String
	 * code,CustomerInformation customerInformation) {
	 * 
	 * try {
	 * 
	 * System.out.println(code+"sfdsfsd-==------------=-=-=-"); String code4 =
	 * redisService.get(Ssstring.CODE+customerInformation.getCustomerPhones());
	 * System.out.println(code+"++++++++++++++++"); if
	 * (code!=null&&code.equals(code4)) {
	 * 
	 * //customerInformationService.saveSelective(customerInformation);
	 * 
	 * map.put("suceess",true);
	 * 
	 * 
	 * }else { //验证码不正确返回重新输入。 map.put("suceess", false);
	 * 
	 * }
	 * 
	 * 
	 * return ResponseEntity.ok(map); } catch (Exception e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * 
	 * return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
}
