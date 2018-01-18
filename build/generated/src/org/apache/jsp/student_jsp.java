package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Home</title>\n");
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"logo\"><h1>Fee Management System</h1></div>\r\n");
      out.write("            <div>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"login.jsp\">Edit</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"reg.jsp\">Logout</a></li>\r\n");
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
      out.write("\n");
      out.write("        <center><h1>Student</h1></center>\n");
      out.write("        ");
 String username=(String)session.getAttribute("username");
        String name=(String)session.getAttribute("name");
        String standard=(String)session.getAttribute("class");
        String phone=(String)session.getAttribute("phone");
        String fee=(String)session.getAttribute("fee");
        
        
      out.write("\n");
      out.write("        <div style=\"margin-left: 200px; margin-top: 80px\">\n");
      out.write("                <h4>UserName:</h4>\n");
      out.write("                <p>");
 out.print(username); 
      out.write("</p><br>\n");
      out.write("                <h4>Name:</h4>\n");
      out.write("                <h5>");

      out.write("</h5><br>\n");
      out.write("                <h4>Class:</h4>\n");
      out.write("                <h5>");

      out.write("</h5><br>\n");
      out.write("                <h4>Phone:</h4>\n");
      out.write("                <h5>");

      out.write("</h5><br>\n");
      out.write("                <h4>Fee Renaming:</h4>\n");
      out.write("                <h5>");

      out.write("</h5><br>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("         \n");
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
