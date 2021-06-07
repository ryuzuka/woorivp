package com.ktbnetwork.homepage.home.en.watwedo.overview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class OverviewHOENController {
	
	@RequestMapping("/home/en/watwedo/overview.do") 
	public String overviewEn(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/watwedo/overview/overview";
						
		}else{
			return "home/en/basic/watwedo/overview/overview";
		}
		
	}
}
