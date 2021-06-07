package com.ktbnetwork.homepage.home.kr.watwedo.history.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class HistoryHOKOController {
	@RequestMapping("/home/watwedo/history.do") 
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/watwedo/history/history";
						
		}else{

			return "home/ko/basic/watwedo/history/history";

		}
	}
}
