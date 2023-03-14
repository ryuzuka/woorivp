package com.ktbnetwork.homepage.home.kr.value.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValueHOKOController {
	@RequestMapping("/home/value.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/value";

		}else{

			return "home/ko/basic/value";

		}
	}
}
