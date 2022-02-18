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


	@RequestMapping("/home/info/news/list.do")
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

	@RequestMapping("/home/info/news/view.do")
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
            } else if (num.equals("31")) {
				return "home/ko/basic/news/news/1031";
            } else if (num.equals("32")) {
				return "home/ko/basic/news/news/1032";
            } else if (num.equals("33")) {
				return "home/ko/basic/news/news/1033";
            } else if (num.equals("34")) {
				return "home/ko/basic/news/news/1034";
            } else if (num.equals("35")) {
				return "home/ko/basic/news/news/1035";
            } else if (num.equals("36")) {
				return "home/ko/basic/news/news/1036";
            } else if (num.equals("37")) {
				return "home/ko/basic/news/news/1037";
            } else if (num.equals("38")) {
				return "home/ko/basic/news/news/1038";
            } else if (num.equals("39")) {
				return "home/ko/basic/news/news/1039";
            } else if (num.equals("40")) {
				return "home/ko/basic/news/news/1040";
            } else if (num.equals("41")) {
				return "home/ko/basic/news/news/1041";
            } else if (num.equals("42")) {
				return "home/ko/basic/news/news/1042";
            } else if (num.equals("43")) {
				return "home/ko/basic/news/news/1043";
            } else if (num.equals("44")) {
				return "home/ko/basic/news/news/1044";
            } else if (num.equals("45")) {
				return "home/ko/basic/news/news/1045";
            } else if (num.equals("46")) {
				return "home/ko/basic/news/news/1046";
            } else if (num.equals("47")) {
				return "home/ko/basic/news/news/1047";
            } else if (num.equals("48")) {
				return "home/ko/basic/news/news/1048";
            } else if (num.equals("49")) {
				return "home/ko/basic/news/news/1049";
            } else if (num.equals("50")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("51")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("52")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("53")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("54")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("55")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("56")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("57")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("58")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("59")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("60")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("61")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("62")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("63")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("64")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("65")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("66")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("67")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("68")) {
				return "home/ko/basic/news/news/1050";
			} else if (num.equals("69")) {
				return "home/ko/basic/news/news/1050";
			}
		}

		return "home/ko/basic/news/news/list";
	}

}
