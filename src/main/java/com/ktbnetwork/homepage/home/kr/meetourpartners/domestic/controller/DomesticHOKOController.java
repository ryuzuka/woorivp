package com.ktbnetwork.homepage.home.kr.meetourpartners.domestic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class DomesticHOKOController {
	@RequestMapping("/home/meetourpartners/domestic.do")
	public String main(Model model) {
			
			if(DeviceUtil.isMobile()){

				return "mobile/ko/basic/meetourpartners/domestic/domestic";
							
			}else{

				return "home/ko/basic/meetourpartners/domestic/domestic";
			}
		
	}
}
