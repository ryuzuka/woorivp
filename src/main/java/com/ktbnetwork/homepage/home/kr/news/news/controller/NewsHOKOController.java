package com.ktbnetwork.homepage.home.kr.news.news.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ktbnetwork.common.util.DeviceUtil;
import com.ktbnetwork.homepage.home.kr.news.vo.NewsVO;

@Controller
public class NewsHOKOController {


	@RequestMapping("/home/news/news/list.do")
	public String list(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("vo") NewsVO vo, Model model) {


		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/news/news/list";

		} else{

			if(vo.getPage() == null || ("").equals(vo.getPage())){
				vo.setPage("1");
			}

			return "home/ko/basic/news/news/list";

		}

	}

	@RequestMapping("/home/news/news/view.do")
	public String view(@ModelAttribute("vo") NewsVO vo, Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/news/news/list";

		} else {

			String num = vo.getNum();

			if(num.equals("1")) {
				return "home/ko/basic/news/news/1001";
			} else if (num.equals("2")) {
				return "home/ko/basic/news/news/1002";
			} else if (num.equals("3")) {
				return "home/ko/basic/news/news/1003";
			} else if (num.equals("4")) {
				return "home/ko/basic/news/news/1004";
			} else if (num.equals("5")) {
				return "home/ko/basic/news/news/1005";
			} else if (num.equals("6")) {
				return "home/ko/basic/news/news/1006";
			} else if (num.equals("7")) {
				return "home/ko/basic/news/news/1007";
			} else if (num.equals("8")) {
				return "home/ko/basic/news/news/1008";
			} else if (num.equals("9")) {
				return "home/ko/basic/news/news/1009";
			} else if (num.equals("10")) {
				return "home/ko/basic/news/news/1010";
			} else if (num.equals("11")) {
				return "home/ko/basic/news/news/1011";
			} else if (num.equals("12")) {
				return "home/ko/basic/news/news/1012";
			} else if (num.equals("13")) {
				return "home/ko/basic/news/news/1013";
			} else if (num.equals("14")) {
				return "home/ko/basic/news/news/1014";
			} else if (num.equals("15")) {
				return "home/ko/basic/news/news/1015";
			} else if (num.equals("16")) {
				return "home/ko/basic/news/news/1016";
			} else if (num.equals("17")) {
				return "home/ko/basic/news/news/1017";
			} else if (num.equals("18")) {
				return "home/ko/basic/news/news/1018";
			} else if (num.equals("19")) {
                return "home/ko/basic/news/news/1019";
            } else if (num.equals("20")) {
                return "home/ko/basic/news/news/1020";
            } else if (num.equals("21")) {
                return "home/ko/basic/news/news/1021";
            } else if (num.equals("22")) {
                return "home/ko/basic/news/news/1022";
            } else if (num.equals("23")) {
                return "home/ko/basic/news/news/1023";
            } else if (num.equals("24")) {
                return "home/ko/basic/news/news/1024";
            } else if (num.equals("25")) {
                return "home/ko/basic/news/news/1025";
            } else if (num.equals("26")) {
                return "home/ko/basic/news/news/1026";
            } else if (num.equals("27")) {
                return "home/ko/basic/news/news/1027";
            } else if (num.equals("28")) {
                return "home/ko/basic/news/news/1028";
            } else if (num.equals("29")) {
                return "home/ko/basic/news/news/1029";
            } else if (num.equals("30")) {
                return "home/ko/basic/news/news/1030";
            }
		}

		return "home/ko/basic/news/news/list";
	}

}
