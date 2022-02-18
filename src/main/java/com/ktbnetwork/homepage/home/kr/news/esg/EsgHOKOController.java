package com.ktbnetwork.homepage.home.kr.news.esg;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EsgHOKOController {
	@RequestMapping("/home/info/esg.do")
	public String main(Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/news/esg/esg";

		}else{

			return "home/ko/basic/news/esg/esg";

		}
	}
}
