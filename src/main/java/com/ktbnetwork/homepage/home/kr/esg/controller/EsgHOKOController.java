package com.ktbnetwork.homepage.home.kr.esg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class EsgHOKOController {
  @RequestMapping("/home/esg.do")
  public String main(Model model) {

    if(DeviceUtil.isMobile()){

      return "mobile/ko/basic/esg";

    }else{

      return "home/ko/basic/esg";
    }

  }
}
