/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nandan Raj
 */
public class StudentEdit extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response){
    response.setContentType("text/html");
    PrintWriter out=null;
    try{
    out=response.getWriter();
   // String uname=request.getParameter("uname");
   HttpSession session=request.getSession();
    String uname=(String)session.getAttribute("username");
    String name=request.getParameter("name");
    String standard=request.getParameter("class");
    String pass=request.getParameter("pass");
    String phone=request.getParameter("phone");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage", "root", "root");
    PreparedStatement pt=con.prepareStatement("update reg set name=? ,class=?,password=?,phone=? where username=?");
    pt.setString(1, name);
    pt.setString(2, standard);
    pt.setString(3, pass);
    pt.setString(4, phone);
    pt.setString(5, uname);
    int a;
    a=pt.executeUpdate();
    if(a==1){
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Details Updated');");
        out.println("location='student.jsp';");
        out.println("</script>");
    }
    else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Error');");
                out.println("location='studentEdit.jsp';");
                out.println("</script>");
    }
    }
    catch(Exception e){
        out.print(e);
        
    }
}
}