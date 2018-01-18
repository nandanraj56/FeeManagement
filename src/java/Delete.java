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
public class Delete extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
            String uname=request.getParameter("uname");
            
            PreparedStatement pt=con.prepareStatement("delete from reg where username=?");
            pt.setString(1,uname);
            int a=0;
            a = pt.executeUpdate();
            if(a==1)
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Delete Succeded');");
                out.println("location='detail.jsp';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Error');");
                out.println("location='detail.jsp';");
                out.println("</script>");
            }
            con.close();
        }
        catch(Exception e){
                out.print(e);
                }
   
}}
