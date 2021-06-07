package com.ktbnetwork.homepage.home.kr.about.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class AboutHOKOController {
	@RequestMapping("/home/about/about.do") 
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/about/about/about";
						
		}else{

			return "home/ko/basic/about/about/about";
		}
		
	}
}
