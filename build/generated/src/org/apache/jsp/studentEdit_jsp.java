package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/studentHeader.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Student Home</title>\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"logo\"><h1>Fee Management System</h1></div>\r\n");
      out.write("            <div>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li><a href=\"student.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"studentEdit.jsp\">Edit</a></li>\r\n");
      out.write("                    <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <!--End of nav-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End of header-->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\n');

    String uname=(String)session.getAttribute("username");
    String pass=(String)session.getAttribute("password");
    String name=(String)session.getAttribute("name");
    String standard=(String)session.getAttribute("class");
    String phone=(String)session.getAttribute("phone");
    


      out.write("\n");
      out.write("    <center><h1>Edit Your Data</h1></center>\n");
      out.write("        <form action=\"StudentEdit\" method=\"post\" style=\"margin-left: 100px;margin-top: 50px\">\n");
      out.write("            <p>Username:</p>\n");
      out.write("            ");
 out.print(uname);
      out.write("<br>\n");
      out.write("            <p>Password</p>\n");
      out.write("            <input type=\"text\" value=\"");
 out.print(pass);
      out.write("\" name=\"pass\">\n");
      out.write("            <p>Name</p>\n");
      out.write("            <input type=\"text\" value=\"");
 out.print(name);
      out.write("\"name=\"name\">\n");
      out.write("            <p>Class</p>\n");
      out.write("            <input type=\"Number\" value=\"");
 out.print(standard);
      out.write("\" min=\"1\"max=\"10\"name=\"class\">\n");
      out.write("            <p>Phone</p>\n");
      out.write("            <input type=\"text\" value=\"");
 out.print(phone);
      out.write("\" name=\"phone\">\n");
      out.write("            \n");
      out.write("            <input type=\"Submit\" value=\"Change\">\n");
      out.write("        </form>\n");
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
