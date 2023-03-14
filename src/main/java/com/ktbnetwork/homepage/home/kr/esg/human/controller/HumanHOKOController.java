package com.ktbnetwork.homepage.home.kr.esg.human.controller;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumanHOKOController {
  @RequestMapping("/home/esg/human.do")
  public String main(Model model) {

    if(DeviceUtil.isMobile()){

      return "mobile/ko/basic/esg/human/human";

    }else{

      return "home/ko/basic/esg/human/human";
    }
  }
}
