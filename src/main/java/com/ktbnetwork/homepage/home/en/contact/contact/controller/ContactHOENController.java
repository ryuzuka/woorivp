package com.ktbnetwork.homepage.home.en.contact.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class ContactHOENController {
	@RequestMapping("/home/en/contact/contact.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/contact/contact/contact";
						
		}else{

			return "home/en/basic/contact/contact/contact";

		}
		
		
	}

}
