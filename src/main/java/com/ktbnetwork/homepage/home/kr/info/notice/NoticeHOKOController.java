package com.ktbnetwork.homepage.home.kr.info.notice;

import com.ktbnetwork.common.util.DeviceUtil;
import com.ktbnetwork.homepage.home.kr.info.vo.NewsVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class NoticeHOKOController {


    @RequestMapping("/home/info/notice/list.do")
    public String list(HttpServletRequest request, HttpServletResponse response,
                       @ModelAttribute("vo") NewsVO vo, Model model) {


        if(DeviceUtil.isMobile()){

            return "mobile/ko/basic/info/notice/list";

        } else{

            if(vo.getPage() == null || ("").equals(vo.getPage())){
                vo.setPage("1");
            }

            return "home/ko/basic/info/notice/list";

        }

    }

    @RequestMapping("/home/info/notice/view.do")
    public String view(@ModelAttribute("vo") NewsVO vo, Model model) {

        if(DeviceUtil.isMobile()){

            return "mobile/ko/basic/info/notice/list";

        } else {

            String num = vo.getNum();

            if(num.equals("1")) {
                return "home/ko/basic/info/notice/1001";
            } else if (num.equals("2")) {
                return "home/ko/basic/info/notice/1002";
            } else if (num.equals("3")) {
                return "home/ko/basic/info/notice/1003";
            } else if (num.equals("4")) {
                return "home/ko/basic/info/notice/1004";
            } else if (num.equals("5")) {
                return "home/ko/basic/info/notice/1005";
            } else if (num.equals("6")) {
                return "home/ko/basic/info/notice/1006";
            } else if (num.equals("7")) {
                return "home/ko/basic/info/notice/1007";
            } else if (num.equals("8")) {
                return "home/ko/basic/info/notice/1008";
            } else if (num.equals("9")) {
                return "home/ko/basic/info/notice/1009";
            } else if (num.equals("10")) {
                return "home/ko/basic/info/notice/1010";
            } else if (num.equals("11")) {
                return "home/ko/basic/info/notice/1011";
            } else if (num.equals("12")) {
                return "home/ko/basic/info/notice/1012";
            } else if (num.equals("13")) {
                return "home/ko/basic/info/notice/1013";
            } else if (num.equals("14")) {
                return "home/ko/basic/info/notice/1014";
            } else if (num.equals("15")) {
                return "home/ko/basic/info/notice/1015";
            } else if (num.equals("16")) {
                return "home/ko/basic/info/notice/1016";
            } else if (num.equals("17")) {
                return "home/ko/basic/info/notice/1017";
            } else if (num.equals("18")) {
                return "home/ko/basic/info/notice/1018";
            } else if (num.equals("19")) {
                return "home/ko/basic/info/notice/1019";
            } else if (num.equals("20")) {
                return "home/ko/basic/info/notice/1020";
            } else if (num.equals("21")) {
                return "home/ko/basic/info/notice/1021";
            } else if (num.equals("22")) {
                return "home/ko/basic/info/notice/1022";
            } else if (num.equals("23")) {
                return "home/ko/basic/info/notice/1023";
            } else if (num.equals("24")) {
                return "home/ko/basic/info/notice/1024";
            } else if (num.equals("25")) {
                return "home/ko/basic/info/notice/1025";
            } else if (num.equals("26")) {
                return "home/ko/basic/info/notice/1026";
            } else if (num.equals("27")) {
                return "home/ko/basic/info/notice/1027";
            } else if (num.equals("28")) {
                return "home/ko/basic/info/notice/1028";
            } else if (num.equals("29")) {
                return "home/ko/basic/info/notice/1029";
            } else if (num.equals("30")) {
                return "home/ko/basic/info/notice/1030";
            } else if (num.equals("31")) {
                return "home/ko/basic/info/notice/1031";
            } else if (num.equals("32")) {
                return "home/ko/basic/info/notice/1032";
            } else if (num.equals("33")) {
                return "home/ko/basic/info/notice/1033";
            } else if (num.equals("34")) {
                return "home/ko/basic/info/notice/1034";
            } else if (num.equals("35")) {
                return "home/ko/basic/info/notice/1035";
            } else if (num.equals("36")) {
                return "home/ko/basic/info/notice/1036";
            } else if (num.equals("37")) {
                return "home/ko/basic/info/notice/1037";
            } else if (num.equals("38")) {
                return "home/ko/basic/info/notice/1038";
            } else if (num.equals("39")) {
                return "home/ko/basic/info/notice/1039";
            } else if (num.equals("40")) {
                return "home/ko/basic/info/notice/1040";
            } else if (num.equals("41")) {
                return "home/ko/basic/info/notice/1041";
            } else if (num.equals("42")) {
                return "home/ko/basic/info/notice/1042";
            } else if (num.equals("43")) {
                return "home/ko/basic/info/notice/1043";
            } else if (num.equals("44")) {
                return "home/ko/basic/info/notice/1044";
            } else if (num.equals("45")) {
                return "home/ko/basic/info/notice/1045";
            } else if (num.equals("46")) {
                return "home/ko/basic/info/notice/1046";
            } else if (num.equals("47")) {
                return "home/ko/basic/info/notice/1047";
            } else if (num.equals("48")) {
                return "home/ko/basic/info/notice/1048";
            } else if (num.equals("49")) {
                return "home/ko/basic/info/notice/1049";
            } else if (num.equals("50")) {
                return "home/ko/basic/info/notice/1050";
            } else if (num.equals("51")) {
                return "home/ko/basic/info/notice/1051";
            } else if (num.equals("52")) {
                return "home/ko/basic/info/notice/1052";
            } else if (num.equals("53")) {
                return "home/ko/basic/info/notice/1053";
            } else if (num.equals("54")) {
                return "home/ko/basic/info/notice/1054";
            } else if (num.equals("55")) {
                return "home/ko/basic/info/notice/1055";
            } else if (num.equals("56")) {
                return "home/ko/basic/info/notice/1056";
            } else if (num.equals("57")) {
                return "home/ko/basic/info/notice/1057";
            } else if (num.equals("58")) {
                return "home/ko/basic/info/notice/1058";
            } else if (num.equals("59")) {
                return "home/ko/basic/info/notice/1059";
            } else if (num.equals("60")) {
                return "home/ko/basic/info/notice/1060";
            } else if (num.equals("61")) {
                return "home/ko/basic/info/notice/1061";
            } else if (num.equals("62")) {
                return "home/ko/basic/info/notice/1062";
            } else if (num.equals("63")) {
                return "home/ko/basic/info/notice/1063";
            } else if (num.equals("64")) {
                return "home/ko/basic/info/notice/1064";
            } else if (num.equals("65")) {
                return "home/ko/basic/info/notice/1065";
            } else if (num.equals("66")) {
                return "home/ko/basic/info/notice/1066";
            } else if (num.equals("67")) {
                return "home/ko/basic/info/notice/1067";
            } else if (num.equals("68")) {
                return "home/ko/basic/info/notice/1068";
            } else if (num.equals("69")) {
                return "home/ko/basic/info/notice/1069";
            } else if (num.equals("70")) {
                return "home/ko/basic/info/notice/1070";
            } else if (num.equals("71")) {
                return "home/ko/basic/info/notice/1071";
            } else if (num.equals("72")) {
                return "home/ko/basic/info/notice/1072";
            } else if (num.equals("73")) {
                return "home/ko/basic/info/notice/1073";
            } else if (num.equals("74")) {
                return "home/ko/basic/info/notice/1074";
            } else if (num.equals("75")) {
                return "home/ko/basic/info/notice/1075";
            } else if (num.equals("76")) {
                return "home/ko/basic/info/notice/1076";
            } else if (num.equals("77")) {
                return "home/ko/basic/info/notice/1077";
            } else if (num.equals("78")) {
                return "home/ko/basic/info/notice/1078";
            } else if (num.equals("79")) {
                return "home/ko/basic/info/notice/1079";
            } else if (num.equals("80")) {
                return "home/ko/basic/info/notice/1080";
            } else if (num.equals("81")) {
                return "home/ko/basic/info/notice/1081";
            } else if (num.equals("82")) {
                return "home/ko/basic/info/notice/1082";
            } else if (num.equals("83")) {
                return "home/ko/basic/info/notice/1083";
            } else if (num.equals("84")) {
                return "home/ko/basic/info/notice/1084";
            } else if (num.equals("85")) {
                return "home/ko/basic/info/notice/1085";
            } else if (num.equals("86")) {
                return "home/ko/basic/info/notice/1086";
            } else if (num.equals("87")) {
                return "home/ko/basic/info/notice/1087";
            } else if (num.equals("88")) {
                return "home/ko/basic/info/notice/1088";
            } else if (num.equals("89")) {
                return "home/ko/basic/info/notice/1089";
            } else if (num.equals("90")) {
                return "home/ko/basic/info/notice/1090";
            } else if (num.equals("91")) {
                return "home/ko/basic/info/notice/1091";
            } else if (num.equals("92")) {
                return "home/ko/basic/info/notice/1092";
            } else if (num.equals("93")) {
                return "home/ko/basic/info/notice/1093";
            } else if (num.equals("94")) {
                return "home/ko/basic/info/notice/1094";
            } else if (num.equals("95")) {
                return "home/ko/basic/info/notice/1095";
            } else if (num.equals("96")) {
                return "home/ko/basic/info/notice/1096";
            } else if (num.equals("97")) {
                return "home/ko/basic/info/notice/1097";
            } else if (num.equals("98")) {
                return "home/ko/basic/info/notice/1098";
            } else if (num.equals("99")) {
                return "home/ko/basic/info/notice/1099";
            } else if (num.equals("100")) {
                return "home/ko/basic/info/notice/1100";
            }
        }

        return "home/ko/basic/info/notice/list";
    }

}
