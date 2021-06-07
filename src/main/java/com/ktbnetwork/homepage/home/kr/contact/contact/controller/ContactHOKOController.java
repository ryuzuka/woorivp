package com.ktbnetwork.homepage.home.kr.contact.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class ContactHOKOController {
	@RequestMapping("/home/contact/contact.do") 
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/contact/contact/contact";
						
		}else{

			return "home/ko/basic/contact/contact/contact";
		}
		
		
	}

}
