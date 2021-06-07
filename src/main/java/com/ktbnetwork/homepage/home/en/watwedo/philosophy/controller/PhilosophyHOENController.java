package com.ktbnetwork.homepage.home.en.watwedo.philosophy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class PhilosophyHOENController {
	
	@RequestMapping("/home/en/watwedo/philosophy.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/watwedo/philosophy/philosophy";
						
		}else{
			return "home/en/basic/watwedo/philosophy/philosophy";
		}
		
	}
		
}
