package com.ktbnetwork.homepage.home.kr.watwedo.slogan.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SloganHOKOController {
	@RequestMapping("/home/watwedo/slogan.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/watwedo/slogan/slogan";

		}else{

			return "home/ko/basic/watwedo/slogan/slogan";

		}
	}
}
