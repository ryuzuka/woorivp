package com.ktbnetwork.homepage.home.en.whoweare.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class KoreaHOENController {
	@RequestMapping("/home/en/whoweare/korea.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/whoweare/korea/korea";
						
		}else{

			return "home/en/basic/whoweare/korea/korea";

		}
		
	}
		

}
