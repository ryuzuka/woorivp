package com.ktbnetwork.homepage.home.kr.meetourpartners.all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class AllHOKOController {
		
		@RequestMapping("/home/meetourpartners/all.do")
		public String main(Model model) {
			
			if(DeviceUtil.isMobile()){

				return "mobile/ko/basic/meetourpartners/all/all";
							
			}else{

				return "home/ko/basic/meetourpartners/all/all";
			}
			
			
		}


}
