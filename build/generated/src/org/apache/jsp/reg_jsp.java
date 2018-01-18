package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/loginHeader.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("    .form1 form h4{\n");
      out.write("        padding-top: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"logo\"><h1>Fee Management System</h1></div>\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"reg.jsp\">Signup</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--End of nav-->\n");
      out.write("        </div>\n");
      out.write("        <!--End of header-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1><center>Registration</center></h1>\n");
      out.write("        <div style=\"padding-left: 50px\" class=\"form1\">\n");
      out.write("        <form action=\"reg\" method=\"post\">\n");
      out.write("            <h4>Enter username</h4>\n");
      out.write("            <input type=\"text\" name=\"uname\" placeholder=\"Username\"required=\"Data Required\"><br>\n");
      out.write("            <h4>Enter password</h4>\n");
      out.write("            <input type=\"password\" name=\"pass\" placeholder=\"Password\"required=\"Data Required\"><br>\n");
      out.write("            <h4>Select </h4>\n");
      out.write("            <input type=\"radio\" name=\"staff\" value=\"1\"required=\"Data Required\">Accountant  \n");
      out.write("            <input type=\"radio\" name=\"staff\" value=\"0\"required=\"Data Required\">Student<br>\n");
      out.write("            <h4>Enter name</h4>\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Full name\"required=\"Data Required\"><br>\n");
      out.write("            <h4>Enter class</h4>\n");
      out.write("            <input type=\"number\" name=\"class\" placeholder=\"class\"required=\"Data Required\" min=\"1\"max=\"10\"><br>\n");
      out.write("            <h4>Enter Phone no:</h4>\n");
      out.write("            <input type=\"text\" name=\"phone\" placeholder=\"phone\"required=\"Data Required\">\n");
      out.write("            <input type=\"submit\" value=\"Register\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
