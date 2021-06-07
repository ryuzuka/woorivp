package com.ktbnetwork.homepage.home.kr.meetourpartners.overseas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class OverseasHOKOController {
	@RequestMapping("/home/meetourpartners/overseas.do")
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/meetourpartners/overseas/overseas";
						
		}else{

			return "home/ko/basic/meetourpartners/overseas/overseas";
		}
	}
}
