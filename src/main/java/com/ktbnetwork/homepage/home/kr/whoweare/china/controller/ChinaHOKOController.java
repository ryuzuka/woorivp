package com.ktbnetwork.homepage.home.kr.whoweare.china.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class ChinaHOKOController {
	@RequestMapping("/home/whoweare/china.do") 
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/whoweare/china/china";
						
		}else{

			return "home/ko/basic/whoweare/china/china";

		}
		
		
	}
}
