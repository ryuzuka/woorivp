package com.ktbnetwork.homepage.home.kr.watwedo.overview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class OverviewHOKOController {
	
	@RequestMapping("/home/watwedo/overview.do") 
	public String overview(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/watwedo/overview/overview";
						
		}else{

			return "home/ko/basic/watwedo/overview/overview";

		}
		
		
	}
}
