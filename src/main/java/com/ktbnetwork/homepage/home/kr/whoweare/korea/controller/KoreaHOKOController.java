package com.ktbnetwork.homepage.home.kr.whoweare.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class KoreaHOKOController {
	@RequestMapping("/home/whoweare/korea.do") 
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/whoweare/korea/korea";
						
		}else{

			return "home/ko/basic/whoweare/korea/korea";

		}
		
		
	}
		
	}
