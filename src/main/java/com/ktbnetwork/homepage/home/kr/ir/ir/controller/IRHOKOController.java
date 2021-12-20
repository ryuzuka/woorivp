package com.ktbnetwork.homepage.home.kr.ir.ir.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IRHOKOController {
	@RequestMapping("/home/ir/ir.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/ir/ir/ir";

		}else{

			return "home/ko/basic/ir/ir/ir";
		}

	}
}
