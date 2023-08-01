package com.ktbnetwork.homepage.home.kr.info.news;

import com.ktbnetwork.common.util.DeviceUtil;
import com.ktbnetwork.homepage.home.kr.info.vo.NewsVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class NewsHOKOController {


	@RequestMapping("/home/info/news/list.do")
	public String list(HttpServletRequest request, HttpServletResponse response,
                     @ModelAttribute("vo") NewsVO vo, Model model) {


		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/info/news/list";

		} else{

			if(vo.getPage() == null || ("").equals(vo.getPage())){
				vo.setPage("1");
			}

			return "home/ko/basic/info/news/list";

		}

	}

	@RequestMapping("/home/info/news/view.do")
	public String view(@ModelAttribute("vo") NewsVO vo, Model model) {

		if(DeviceUtil.isMobile()){

			return "mobile/ko/basic/info/news/list";

		} else {

			String num = vo.getNum();

			if(num.equals("1")) {
				return "home/ko/basic/info/news/1001";
			} else if (num.equals("2")) {
				return "home/ko/basic/info/news/1002";
			} else if (num.equals("3")) {
				return "home/ko/basic/info/news/1003";
			} else if (num.equals("4")) {
				return "home/ko/basic/info/news/1004";
			} else if (num.equals("5")) {
				return "home/ko/basic/info/news/1005";
			} else if (num.equals("6")) {
				return "home/ko/basic/info/news/1006";
			} else if (num.equals("7")) {
				return "home/ko/basic/info/news/1007";
			} else if (num.equals("8")) {
				return "home/ko/basic/info/news/1008";
			} else if (num.equals("9")) {
				return "home/ko/basic/info/news/1009";
			} else if (num.equals("10")) {
				return "home/ko/basic/info/news/1010";
			} else if (num.equals("11")) {
				return "home/ko/basic/info/news/1011";
			} else if (num.equals("12")) {
				return "home/ko/basic/info/news/1012";
			} else if (num.equals("13")) {
				return "home/ko/basic/info/news/1013";
			} else if (num.equals("14")) {
				return "home/ko/basic/info/news/1014";
			} else if (num.equals("15")) {
				return "home/ko/basic/info/news/1015";
			} else if (num.equals("16")) {
				return "home/ko/basic/info/news/1016";
			} else if (num.equals("17")) {
				return "home/ko/basic/info/news/1017";
			} else if (num.equals("18")) {
				return "home/ko/basic/info/news/1018";
			} else if (num.equals("19")) {
				return "home/ko/basic/info/news/1019";
			} else if (num.equals("20")) {
				return "home/ko/basic/info/news/1020";
			} else if (num.equals("21")) {
				return "home/ko/basic/info/news/1021";
			} else if (num.equals("22")) {
				return "home/ko/basic/info/news/1022";
			} else if (num.equals("23")) {
				return "home/ko/basic/info/news/1023";
			} else if (num.equals("24")) {
				return "home/ko/basic/info/news/1024";
			} else if (num.equals("25")) {
				return "home/ko/basic/info/news/1025";
			} else if (num.equals("26")) {
				return "home/ko/basic/info/news/1026";
			} else if (num.equals("27")) {
				return "home/ko/basic/info/news/1027";
			} else if (num.equals("28")) {
				return "home/ko/basic/info/news/1028";
			} else if (num.equals("29")) {
				return "home/ko/basic/info/news/1029";
			} else if (num.equals("30")) {
				return "home/ko/basic/info/news/1030";
			} else if (num.equals("31")) {
				return "home/ko/basic/info/news/1031";
			} else if (num.equals("32")) {
				return "home/ko/basic/info/news/1032";
			} else if (num.equals("33")) {
				return "home/ko/basic/info/news/1033";
			} else if (num.equals("34")) {
				return "home/ko/basic/info/news/1034";
			} else if (num.equals("35")) {
				return "home/ko/basic/info/news/1035";
			} else if (num.equals("36")) {
				return "home/ko/basic/info/news/1036";
			} else if (num.equals("37")) {
				return "home/ko/basic/info/news/1037";
			} else if (num.equals("38")) {
				return "home/ko/basic/info/news/1038";
			} else if (num.equals("39")) {
				return "home/ko/basic/info/news/1039";
			} else if (num.equals("40")) {
				return "home/ko/basic/info/news/1040";
			} else if (num.equals("41")) {
				return "home/ko/basic/info/news/1041";
			} else if (num.equals("42")) {
				return "home/ko/basic/info/news/1042";
			} else if (num.equals("43")) {
				return "home/ko/basic/info/news/1043";
			} else if (num.equals("44")) {
				return "home/ko/basic/info/news/1044";
			} else if (num.equals("45")) {
				return "home/ko/basic/info/news/1045";
			} else if (num.equals("46")) {
				return "home/ko/basic/info/news/1046";
			} else if (num.equals("47")) {
				return "home/ko/basic/info/news/1047";
			} else if (num.equals("48")) {
				return "home/ko/basic/info/news/1048";
			} else if (num.equals("49")) {
				return "home/ko/basic/info/news/1049";
			} else if (num.equals("50")) {
				return "home/ko/basic/info/news/1050";
			} else if (num.equals("51")) {
				return "home/ko/basic/info/news/1051";
			} else if (num.equals("52")) {
				return "home/ko/basic/info/news/1052";
			} else if (num.equals("53")) {
				return "home/ko/basic/info/news/1053";
			} else if (num.equals("54")) {
				return "home/ko/basic/info/news/1054";
			} else if (num.equals("55")) {
				return "home/ko/basic/info/news/1055";
			} else if (num.equals("56")) {
				return "home/ko/basic/info/news/1056";
			} else if (num.equals("57")) {
				return "home/ko/basic/info/news/1057";
			} else if (num.equals("58")) {
				return "home/ko/basic/info/news/1058";
			} else if (num.equals("59")) {
				return "home/ko/basic/info/news/1059";
			} else if (num.equals("60")) {
				return "home/ko/basic/info/news/1060";
			} else if (num.equals("61")) {
				return "home/ko/basic/info/news/1061";
			} else if (num.equals("62")) {
				return "home/ko/basic/info/news/1062";
			} else if (num.equals("63")) {
				return "home/ko/basic/info/news/1063";
			} else if (num.equals("64")) {
				return "home/ko/basic/info/news/1064";
			} else if (num.equals("65")) {
				return "home/ko/basic/info/news/1065";
			} else if (num.equals("66")) {
				return "home/ko/basic/info/news/1066";
			} else if (num.equals("67")) {
				return "home/ko/basic/info/news/1067";
			} else if (num.equals("68")) {
				return "home/ko/basic/info/news/1068";
			} else if (num.equals("69")) {
				return "home/ko/basic/info/news/1069";
			} else if (num.equals("70")) {
				return "home/ko/basic/info/news/1070";
			} else if (num.equals("71")) {
				return "home/ko/basic/info/news/1071";
			} else if (num.equals("72")) {
				return "home/ko/basic/info/news/1072";
			} else if (num.equals("73")) {
				return "home/ko/basic/info/news/1073";
			} else if (num.equals("74")) {
				return "home/ko/basic/info/news/1074";
			} else if (num.equals("75")) {
				return "home/ko/basic/info/news/1075";
			} else if (num.equals("76")) {
				return "home/ko/basic/info/news/1076";
			} else if (num.equals("77")) {
				return "home/ko/basic/info/news/1077";
			} else if (num.equals("78")) {
				return "home/ko/basic/info/news/1078";
			} else if (num.equals("79")) {
				return "home/ko/basic/info/news/1079";
			} else if (num.equals("80")) {
				return "home/ko/basic/info/news/1080";
			} else if (num.equals("81")) {
				return "home/ko/basic/info/news/1081";
			} else if (num.equals("82")) {
				return "home/ko/basic/info/news/1082";
			} else if (num.equals("83")) {
				return "home/ko/basic/info/news/1083";
			} else if (num.equals("84")) {
				return "home/ko/basic/info/news/1084";
			} else if (num.equals("85")) {
				return "home/ko/basic/info/news/1085";
			} else if (num.equals("86")) {
				return "home/ko/basic/info/news/1086";
			} else if (num.equals("87")) {
				return "home/ko/basic/info/news/1087";
			} else if (num.equals("88")) {
				return "home/ko/basic/info/news/1088";
			} else if (num.equals("89")) {
				return "home/ko/basic/info/news/1089";
			} else if (num.equals("90")) {
				return "home/ko/basic/info/news/1090";
			} else if (num.equals("91")) {
				return "home/ko/basic/info/news/1091";
			} else if (num.equals("92")) {
				return "home/ko/basic/info/news/1092";
			} else if (num.equals("93")) {
				return "home/ko/basic/info/news/1093";
			} else if (num.equals("94")) {
				return "home/ko/basic/info/news/1094";
			} else if (num.equals("95")) {
				return "home/ko/basic/info/news/1095";
			} else if (num.equals("96")) {
				return "home/ko/basic/info/news/1096";
			} else if (num.equals("97")) {
				return "home/ko/basic/info/news/1097";
			} else if (num.equals("98")) {
				return "home/ko/basic/info/news/1098";
			} else if (num.equals("99")) {
				return "home/ko/basic/info/news/1099";
			} else if (num.equals("100")) {
				return "home/ko/basic/info/news/1100";
			} else if (num.equals("101")) {
				return "home/ko/basic/info/news/1101";
			} else if (num.equals("102")) {
				return "home/ko/basic/info/news/1102";
			} else if (num.equals("103")) {
				return "home/ko/basic/info/news/1103";
			} else if (num.equals("104")) {
				return "home/ko/basic/info/news/1104";
			} else if (num.equals("105")) {
				return "home/ko/basic/info/news/1105";
			} else if (num.equals("106")) {
				return "home/ko/basic/info/news/1106";
			} else if (num.equals("107")) {
				return "home/ko/basic/info/news/1107";
			} else if (num.equals("108")) {
				return "home/ko/basic/info/news/1108";
			} else if (num.equals("109")) {
				return "home/ko/basic/info/news/1109";
			} else if (num.equals("110")) {
				return "home/ko/basic/info/news/1110";
			} else if (num.equals("111")) {
				return "home/ko/basic/info/news/1111";
			} else if (num.equals("112")) {
				return "home/ko/basic/info/news/1112";
			} else if (num.equals("113")) {
				return "home/ko/basic/info/news/1113";
			} else if (num.equals("114")) {
				return "home/ko/basic/info/news/1114";
			} else if (num.equals("115")) {
				return "home/ko/basic/info/news/1115";
			} else if (num.equals("116")) {
				return "home/ko/basic/info/news/1116";
			} else if (num.equals("117")) {
				return "home/ko/basic/info/news/1117";
			} else if (num.equals("118")) {
				return "home/ko/basic/info/news/1118";
			} else if (num.equals("119")) {
				return "home/ko/basic/info/news/1119";
			} else if (num.equals("120")) {
				return "home/ko/basic/info/news/1120";
			} else if (num.equals("121")) {
				return "home/ko/basic/info/news/1121";
			} else if (num.equals("122")) {
				return "home/ko/basic/info/news/1122";
			} else if (num.equals("123")) {
				return "home/ko/basic/info/news/1123";
			} else if (num.equals("124")) {
				return "home/ko/basic/info/news/1124";
			} else if (num.equals("125")) {
				return "home/ko/basic/info/news/1125";
			} else if (num.equals("126")) {
				return "home/ko/basic/info/news/1126";
			} else if (num.equals("127")) {
				return "home/ko/basic/info/news/1127";
			} else if (num.equals("128")) {
				return "home/ko/basic/info/news/1128";
			} else if (num.equals("129")) {
				return "home/ko/basic/info/news/1129";
			} else if (num.equals("130")) {
				return "home/ko/basic/info/news/1130";
			} else if (num.equals("131")) {
				return "home/ko/basic/info/news/1131";
			} else if (num.equals("132")) {
				return "home/ko/basic/info/news/1132";
			} else if (num.equals("133")) {
				return "home/ko/basic/info/news/1133";
			} else if (num.equals("134")) {
				return "home/ko/basic/info/news/1134";
			} else if (num.equals("135")) {
				return "home/ko/basic/info/news/1135";
			} else if (num.equals("136")) {
				return "home/ko/basic/info/news/1136";
			} else if (num.equals("137")) {
				return "home/ko/basic/info/news/1137";
			} else if (num.equals("138")) {
				return "home/ko/basic/info/news/1138";
			} else if (num.equals("139")) {
				return "home/ko/basic/info/news/1139";
			} else if (num.equals("140")) {
				return "home/ko/basic/info/news/1140";
			} else if (num.equals("141")) {
				return "home/ko/basic/info/news/1141";
			} else if (num.equals("142")) {
				return "home/ko/basic/info/news/1142";
			} else if (num.equals("143")) {
				return "home/ko/basic/info/news/1143";
			} else if (num.equals("144")) {
				return "home/ko/basic/info/news/1144";
			} else if (num.equals("145")) {
				return "home/ko/basic/info/news/1145";
			} else if (num.equals("146")) {
				return "home/ko/basic/info/news/1146";
			} else if (num.equals("147")) {
				return "home/ko/basic/info/news/1147";
			} else if (num.equals("148")) {
				return "home/ko/basic/info/news/1148";
			} else if (num.equals("149")) {
				return "home/ko/basic/info/news/1149";
			} else if (num.equals("150")) {
				return "home/ko/basic/info/news/1150";
			}
		}

		return "home/ko/basic/info/news/list";
	}

}
