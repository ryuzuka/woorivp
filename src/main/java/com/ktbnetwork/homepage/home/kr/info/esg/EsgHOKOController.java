package com.ktbnetwork.homepage.home.kr.info.esg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;

@Controller
public class EsgHOKOController {
  @RequestMapping("/home/info/esg.do")
  public String main(Model model) {

    if(DeviceUtil.isMobile()){

      return "mobile/ko/basic/info/esg/esg";

    }else{

      return "home/ko/basic/info/esg/esg";
    }

  }
}
