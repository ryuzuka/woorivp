package com.ktbnetwork.homepage.home.en.meetourpartners.all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class AllHOENController {
	@RequestMapping("/home/en/meetourpartners/all.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/meetourpartners/all/all";
						
		}else{

			return "home/en/basic/meetourpartners/all/all";

		}
		
		
	}

}
