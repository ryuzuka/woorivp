package com.ktbnetwork.homepage.home.en.whoweare.china.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class ChinaHOENController {
	@RequestMapping("/home/en/whoweare/china.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/whoweare/china/china";
						
		}else{

			return "home/en/basic/whoweare/china/china";

		}
		
	}

}
