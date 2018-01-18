/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nandan Raj
 */
public class Login extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        Connection con=null;
        HttpSession session=request.getSession(true);
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
            PreparedStatement pt=con.prepareStatement("Select * from reg where username=? and password=?");
            pt.setString(1,uname);
            pt.setString(2, pass);
            ResultSet rs=pt.executeQuery();
            if(rs.next()){

                if(uname.equals(rs.getString(1))&&pass.equals(rs.getString(2))){
                        if(rs.getInt(3)==1){
                         session.setAttribute("username",rs.getString(1));
                        session.setAttribute("name",rs.getString(4));
                     
                        session.setAttribute("phone",rs.getString(6));
                        
                         response.sendRedirect("accountant.jsp");
                        }
                       
                        else{
                        session.setAttribute("username",rs.getString(1));
                        session.setAttribute("name",rs.getString(4));
                        session.setAttribute("class",rs.getString(5));
                        session.setAttribute("phone",rs.getString(6));
                        session.setAttribute("fee",rs.getString(7));
                        session.setAttribute("password",rs.getString(2));
                        response.sendRedirect("student.jsp");
                        }
                        
                }
                
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Username or password incorrect');");
                out.println("location='login.jsp';");
                out.println("</script>");
            }
        }
        catch(Exception e){
            out.println(e);
        }
        
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
    }
}

   