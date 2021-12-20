package com.ktbnetwork.homepage.home.kr.watwedo.esg.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EsgHOKOController {
	@RequestMapping("/home/watwedo/esg.do")
	public String main(Model model) {
		if(DeviceUtil.isMobile()){
			return "mobile/ko/basic/watwedo/esg/esg";

		}else{
			return "home/ko/basic/watwedo/esg/esg";

		}
	}
}
