/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2019-04-15 06:47:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.home.kr.general.watwedo.philosophy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class philosophy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/common/import/taglib.jspf", Long.valueOf(1555304080000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528432326000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\t\t<section id=\"container\" class=\"container\">\n");
      out.write("\t\t\t<nav class=\"nav\">\n");
      out.write("\t\t\t\t<ol class=\"navArea\"><li>HOME</li><li>What We Do</li></ol>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"visualArea\">\n");
      out.write("\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t<h1 class=\"pageTit\">What We Do</h1>\n");
      out.write("\t\t\t\t\t\t<p class=\"pageTxt\">고객의 가능성과 함께하는 KTB네트워크입니다.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tabArea\">\n");
      out.write("\t\t\t\t\t<ul class=\"pageTab\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/home/watwedo/overview.do\">Overview</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/home/watwedo/history.do\">History</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"on\"><a href=\"/home/watwedo/philosophy.do\" aria-selected=\"true\">Philosophy</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<h2 class=\"hidden\">Philosophy</h2>\t\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">운용철학</h3>\t\n");
      out.write("\t\t\t\t\t<div class=\"Philosophy\">\n");
      out.write("\t\t\t\t\t\t<div class=\"imgArea\"><img src=\"/static/home/kr/images/main/img_goal.png\" alt=\"Compliance, Active Value Creation, Alignment of Interest\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"conArea\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><strong>Alignment of Interest</strong>펀드 참여자 간의 이해관계 일치를 통한 공동의 목표 부여</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><strong>Active Value Creation</strong>투자업체 지원 및 가치창출 활동을 통해 지속 가능한 성장도모, <br>투자업체 성공과 목표수익 달성</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><strong>Compliance</strong>Compliance 체계 및 점검활동 통한 펀드 운용위험 통제, <br>Moral Hazard 예방</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">STAGES</h3>\t\n");
      out.write("\t\t\t\t\t<p class=\"txtInfo\">KTB네트워크의 투자는 어느 한 기업의 성장 단계에 국한되지 않습니다. 기업들이 지속적으로 팀을 만들고, 사업 모델을 구상하며, IPO를 준비하고, 사모채권에 대해 고려할 수 있도록 지원하고 그 안에서의 가치를 찾는 역할을 하겠습니다.</p>\n");
      out.write("\t\t\t\t\t<h4 class=\"titDep3\">Stage Investment</h4>\n");
      out.write("\t\t\t\t\t<ul class=\"plopList\">\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy01.png\" alt=\"\"><span>Early</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy02.png\" alt=\"\"><span>Growth</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy03.png\" alt=\"\"><span>Late</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy04.png\" alt=\"\"><span>Pre-IPO</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy05.png\" alt=\"\"><span>PIPE</span></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">SECTORS</h3>\t\n");
      out.write("\t\t\t\t\t<p class=\"txtInfo\">KTB네트워크는 모든 분야에서 기회를 찾습니다. 수년간 소비자 서비스, 의료/보건, 교육, 디지털 미디어, 엔터테인먼트 및 인터넷/모바일 분야에서 새로운 기회 및 경험, 전문성을 쌓고 있습니다.</p>\n");
      out.write("\t\t\t\t\t<h4 class=\"titDep3\">Investment Sectors</h4>\n");
      out.write("\t\t\t\t\t<ul class=\"plopList\">\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy06.png\" alt=\"\"><span>Consumer <br>Service</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy07.png\" alt=\"\"><span>Internet &amp; Mobile <br>Service</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy08.png\" alt=\"\"><span>Medical &amp; <br>Healthcare</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy09.png\" alt=\"\"><span>Education</span></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/static/home/kr/images/contents/ico_philosophy10.png\" alt=\"\"><span>Digital Media &amp; <br>Entertainment</span></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
