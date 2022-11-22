package com.ktbnetwork.homepage.home.kr.whoweare.singapore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class SingaporeHOKOController {
	@RequestMapping("/home/whoweare/singapore.do")
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/whoweare/singapore/singapore";

		}else{

			return "home/ko/basic/whoweare/singapore/singapore";

		}


	}

	}
