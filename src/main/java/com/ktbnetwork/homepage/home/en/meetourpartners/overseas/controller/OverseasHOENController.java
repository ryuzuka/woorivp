package com.ktbnetwork.homepage.home.en.meetourpartners.overseas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class OverseasHOENController {
	@RequestMapping("/home/en/meetourpartners/overseas.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/meetourpartners/overseas/overseas";
						
		}else{

			return "home/en/basic/meetourpartners/overseas/overseas";

		}
		
		
	}
}
