package com.ktbnetwork.homepage.home.en.meetourpartners.domestic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class DomesticHOENController {
	@RequestMapping("/home/en/meetourpartners/domestic.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/meetourpartners/domestic/domestic";
						
		}else{

			return "home/en/basic/meetourpartners/domestic/domestic";

		}
		
	}
}
