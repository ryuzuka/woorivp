package com.ktbnetwork.homepage.home.kr.info.ir;

import com.ktbnetwork.common.util.DeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IrHOKOController {
  @RequestMapping("/home/info/ir.do")
  public String main(Model model) {

    if(DeviceUtil.isMobile()){

      return "mobile/ko/basic/info/ir/ir";

    }else{

      return "home/ko/basic/info/ir/ir";
    }

  }
}
