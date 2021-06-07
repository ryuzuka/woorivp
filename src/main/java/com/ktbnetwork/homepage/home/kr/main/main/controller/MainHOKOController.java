package com.ktbnetwork.homepage.home.kr.main.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

/**
 * <pre>
 * @FileName : MainHOKOController.java
 * @Date : 2019. 4. 6.
 * @author dnms5
 * @History : 
 * @Description : 메인 | PC(국문) Controller
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
@Controller
public class MainHOKOController {

	/**
	 * <pre>
	 * @Date : 2019. 4. 6.
	 * @author dnms5
	 * @History : 
	 * @Description : 메인 | PC(국문)
	 * </pre>
	 *
	 * @param model
	 * @return

	 */
	
	@RequestMapping("/home/main/main.do")
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			model.addAttribute("bodyClass", "mMain"); //body CSS Class
			
			return "mobile/ko/main";
						
		}else{

			model.addAttribute("bodyClass", "main"); //body CSS Class
			
			return "home/ko/main";
		}
		
		
	}
}
