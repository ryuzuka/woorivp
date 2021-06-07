package com.ktbnetwork.homepage.home.en.watwedo.history.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class HistoryHOENController {
	
	@RequestMapping("/home/en/watwedo/history.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/watwedo/history/history";
						
		}else{
			return "home/en/basic/watwedo/history/history";
		}
		
	}
}
