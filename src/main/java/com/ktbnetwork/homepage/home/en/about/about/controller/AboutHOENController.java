package com.ktbnetwork.homepage.home.en.about.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class AboutHOENController {
	@RequestMapping("/home/en/about/about.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/about/about/about";
						
		}else{

			return "home/en/basic/about/about/about";

		}
		
	}

}
