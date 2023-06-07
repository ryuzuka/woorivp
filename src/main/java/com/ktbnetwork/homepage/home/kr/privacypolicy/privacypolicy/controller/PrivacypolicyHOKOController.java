package com.ktbnetwork.homepage.home.kr.privacypolicy.privacypolicy.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrivacypolicyHOKOController {
	@RequestMapping("/home/privacypolicy/privacypolicy.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/privacypolicy/privacypolicy/privacypolicy";

		}else{

			return "home/ko/basic/privacypolicy/privacypolicy/privacypolicy";

		}
	}
}
