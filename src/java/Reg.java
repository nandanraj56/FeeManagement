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

/**
 *
 * @author Nandan Raj
 */
public class Reg extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            String staff=request.getParameter("staff");
            String name=request.getParameter("name");
            String standard=request.getParameter("class");
            String phone=request.getParameter("phone");
            PreparedStatement pt=con.prepareStatement("insert into reg values(?,?,?,?,?,?,'50000');");
            pt.setString(1,uname);
            pt.setString(2,pass);
            pt.setString(3,staff);
            pt.setString(4,name);
            pt.setString(5,standard);
            pt.setString(6,phone);
            
            int a;
            a = pt.executeUpdate();
            
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration Done');");
            out.println("location='index.jsp';");
            out.println("</script>");
            
            
        }
        catch(Exception e){
            out.println(e);
        }
        
    }
}
