package com.ktbnetwork.homepage.home.kr.esg.esg.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EsgHOKOController {
  @RequestMapping("/home/esg/esg.do")
  public String main(Model model) {

    if(DeviceUtil.isMobile()){

      return "mobile/ko/basic/esg/esg/esg";

    }else{

      return "home/ko/basic/esg/esg/esg";
    }
  }
}
