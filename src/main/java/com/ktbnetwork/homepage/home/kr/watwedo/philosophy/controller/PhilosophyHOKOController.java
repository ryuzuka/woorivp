package com.ktbnetwork.homepage.home.kr.watwedo.philosophy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class PhilosophyHOKOController {
	@RequestMapping("/home/watwedo/philosophy.do") 
	public String overview(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/watwedo/philosophy/philosophy";
						
		}else{

			return "home/ko/basic/watwedo/philosophy/philosophy";

		}
		
		
	}
}
