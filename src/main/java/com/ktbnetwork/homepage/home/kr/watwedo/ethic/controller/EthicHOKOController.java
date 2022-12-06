package com.ktbnetwork.homepage.home.kr.watwedo.ethic.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EthicHOKOController {
	@RequestMapping("/home/watwedo/ethic.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/watwedo/ethic/ethic";

		}else{

			return "home/ko/basic/watwedo/ethic/ethic";

		}
	}
}
