package com.ktbnetwork.homepage.home.en.whoweare.singapore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class SingaporeHOENController {
	@RequestMapping("/home/en/whoweare/singapore.do")
	public String main(Model model) {
		if(DeviceUtil.isMobile()){

			return "mobile/en/basic/whoweare/singapore/singapore";

		}else{

			return "home/en/basic/whoweare/singapore/singapore";

		}

	}

}
