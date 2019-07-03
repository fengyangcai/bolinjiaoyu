package cn.bolinjiaoyu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page")
public class PageController {
	
	
	/*
	 * @RequestMapping(value = "/{pageName}") public String
	 * topPage(@PathVariable("pageName")String pageName,@RequestParam("urlString")
	 * String urlString) {
	 * 
	 * String urlName="redirect:"+ pageName+"?urlString="+urlString;
	 * 
	 * return urlName; }
	 */
	 
	
	  @RequestMapping(value = "/{pageName}") 
	  public String toPage(@PathVariable("pageName")String pageName,@RequestParam("sourceLink") String sourceLink,HttpServletRequest request,HttpServletResponse response) {
	  
	 System.out.println("pageName:==" +pageName);
	 System.out.println("urlString:==" +sourceLink);
	// 获取请求是从哪里来的
	String referer = request.getHeader("referer");
	System.out.println(referer);
	ModelAndView mv = new ModelAndView();
	mv.addObject("sourceLink", sourceLink);
	 return pageName; 
	  }
	
	
}
