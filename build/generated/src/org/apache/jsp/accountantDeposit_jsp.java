package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.PrintWriter;

public final class accountantDeposit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/accountantHeader.jsp");
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
      out.write("\n");
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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Accountant Panel</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"logo\"><h1>Fee Management System</h1></div>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"accountant.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"accountantDeposit.jsp\">Money</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"detail.jsp\">View Students</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!--End of nav-->\n");
      out.write("        </div>\n");
      out.write("        <!--End of header-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <center><h1>Check Remaining Fee</h1></center>\n");
      out.write("    <div style=\"padding-left: 50px\">\n");
      out.write("        <form action=\"accountantDeposit.jsp\" style=\"margin-bottom: 20px\">\n");
      out.write("            <h4>Enter Student Username</h4>\n");
      out.write("            <input type=\"text\" name=\"uname\" placeholder=\"username\"required=\"Data Required\">\n");
      out.write("            <input type=\"submit\" value=\"Remaning Fee\" >\n");
      out.write("        </form>\n");
      out.write("        ");
 String uname=request.getParameter("uname");
        if(uname!=null){
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
            PreparedStatement pst=con.prepareStatement("Select fee from reg where username=?");
            pst.setString(1,uname);

            ResultSet rs=pst.executeQuery();
            if(rs.next()){
            out.print(rs.getString(1));
            con.close();}
            else
            out.print("Wrong username");
        }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("        <div style=\"padding-left: 50px\">\n");
      out.write("        <form action=\"AccountantDeposit\">\n");
      out.write("            \n");
      out.write("            <center><h1>Deposit Fee</h1></center>\n");
      out.write("            <h4>Enter Student Username</h4>\n");
      out.write("            <input type=\"text\" name=\"uname\" placeholder=\"username\" required=\"Data Required\">\n");
      out.write("            <h4>Enter Amount</h4>\n");
      out.write("            <input type=\"text\" name=\"amount\" placeholder=\"amount\" required=\"Data Required\">\n");
      out.write("            <input type=\"submit\" value=\"Deposit\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
