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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nandan Raj
 */
public class AccountantDeposit extends HttpServlet {
@Override
   
   
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Connection con=null;
        int balance,money=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
            String uname=request.getParameter("uname");
            String amount=request.getParameter("amount");
            PreparedStatement st=con.prepareStatement("select fee from reg where username=?");
            st.setString(1, uname);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                balance=rs.getInt(1);
                int amountInt = Integer.parseInt(amount);
                while(amountInt>balance)
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Deposit Amount More than Due');");
                    out.println("location='accountantDeposit.jsp';");
                    out.println("</script>");
                }
                money=balance-Integer.parseInt(amount);
                
            }
            else{
                out.println("<script type=\"text/javascript\">");
            out.println("alert('Wrong Username');");
            out.println("location='accountantDeposit.jsp';");
            out.println("</script>");
            }
            
            PreparedStatement pt=con.prepareStatement("update reg set fee=? where username=?;");
            pt.setString(1,Integer.toString(money));
            pt.setString(2,uname);
           
            
            int a;
            a = pt.executeUpdate();
            
            con.close();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Money Deposited');");
            out.println("location='accountantDeposit.jsp';");
            out.println("</script>");
            //response.sendRedirect("accountantDeposit.jsp");
        }
        catch(Exception e){
            out.print(e);
        }
        
        
}}