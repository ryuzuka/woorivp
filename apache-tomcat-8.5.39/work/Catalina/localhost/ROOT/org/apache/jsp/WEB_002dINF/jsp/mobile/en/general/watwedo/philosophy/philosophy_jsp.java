/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2019-04-16 00:48:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.mobile.en.general.watwedo.philosophy;

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

      out.write('\r');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\t<section class=\"container\">\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<div class=\"visualArea\">\r\n");
      out.write("\t\t\t\t<h1 class=\"pageTit\">What We Do</h1>\r\n");
      out.write("\t\t\t\t<p role=\"text\" class=\"pageTxt\">We stand with our client’s potential.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"partner\">\r\n");
      out.write("\t\t\t\t<div class=\"tabType1\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/home/en/watwedo/overview.do\">Overview</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/home/en/watwedo/history.do\">History</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"on\"><a href=\"/home/en/watwedo/philosophy.do\" aria-selected=\"true\">Philosophy</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"tabCont\"  style=\"display:block\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"hidden\">Philosophy</h2>\r\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">Corporate Philosophy</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_introcon_txt.png\" alt=\"Compliance Active Value Creation Alignment of Interest\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"introCon\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"check01\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Alignment of Interest</strong>We align our partners towards a common goal.\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"check02\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Active Value Creation</strong>We support our portfolio companies through value-creating activities to achieve sustainable growth, the companies’ success and attaining returns\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"check03\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Compliance</strong>We actively maintain our compliance system to control operational risk and prevent moral hazard\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">STAGES</h3>\r\n");
      out.write("\t\t\t\t\t<p class=\"txtInfo\">Our investment is not limited to any one of companies’ growth stage, We believe that we can find our role in supporting and providing values whether the company is still building its team, devising its business model, preparing for IPO or considering private placements.</p>\t\r\n");
      out.write("\t\t\t\t\t<h4 class=\"titDep3\">Stage Investment</h4>\r\n");
      out.write("\t\t\t\t\t<ul class=\"ico_list\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy01.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Early</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy02.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Growth</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy03.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Late</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy04.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Pre-IPO</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy05.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>PIPE</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<h3 class=\"titDep2\">SECTORS</h3>\r\n");
      out.write("\t\t\t\t\t<p class=\"txtInfo\">We look for opportunities in all market segments. But over the years we have accrued experience and expertise in finding new opportunities in consumer service, medical/healthcare, education, digital media, entertainment and internet/mobile sectors.</p>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"titDep3\">Investment Sectors</h4>\r\n");
      out.write("\t\t\t\t\t<ul class=\"ico_list\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy06.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Consumer<br>Service</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy07.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Internet &amp; Mobile<br>Service</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy08.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Medical &amp;<br>Healthcare</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy10.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Education</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/mobile/en/images/contents/img_ico_philosophy09.gif\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<em>Digital Media &amp;<br>Entertainment</em>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!-- //contents -->\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
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
