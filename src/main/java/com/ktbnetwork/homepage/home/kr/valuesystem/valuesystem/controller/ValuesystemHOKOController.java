package com.ktbnetwork.homepage.home.kr.valuesystem.valuesystem.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValuesystemHOKOController {
	@RequestMapping("/home/valuesystem/valuesystem.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/valuesystem/valuesystem/valuesystem";

		}else{

			return "home/ko/basic/valuesystem/valuesystem/valuesystem";

		}
	}
}
