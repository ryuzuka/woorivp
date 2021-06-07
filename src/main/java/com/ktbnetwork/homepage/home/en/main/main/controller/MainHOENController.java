package com.ktbnetwork.homepage.home.en.main.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

/**
 * <pre>
 * @FileName : MainHOENController.java
 * @Date : 2019. 4. 6.
 * @author dnms5
 * @History : 
 * @Description : 메인 | PC(영문) Controller
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
@Controller
public class MainHOENController {

	/**
	 * <pre>
	 * @Date : 2019. 4. 6.
	 * @author dnms5
	 * @History : 
	 * @Description : 메인 | PC(영문)
	 * </pre>
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping("/home/en/main/main.do")
	public String main(Model model) {
		
		if(DeviceUtil.isMobile()){

			model.addAttribute("bodyClass", "mMain"); //body CSS Class
			
			return "mobile/en/main";
						
		}else{
			
			model.addAttribute("bodyClass", "main en"); //body CSS Class
			
			return "home/en/main";

		}

	}
}
