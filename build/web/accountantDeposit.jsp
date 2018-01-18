<%-- 
    Document   : accountantDeposit
    Created on : Jan 17, 2018, 12:14:27 PM
    Author     : Nandan Raj
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<%String username=(String)session.getAttribute("username");
if(username==null){
    response.sendRedirect("login.jsp");
}%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
    <%@include file="accountantHeader.jsp"%>
    <center><h1>Check Remaining Fee</h1></center>
    <div style="padding-left: 50px">
        <form action="accountantDeposit.jsp" style="margin-bottom: 20px">
            <h4>Enter Student Username</h4>
            <input type="text" name="uname" placeholder="username"required="Data Required">
            <input type="submit" value="Remaning Fee" >
        </form>
        <% String uname=request.getParameter("uname");
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
        %>
    </div>
    <hr>
        <div style="padding-left: 50px">
        <form action="AccountantDeposit">
            
            <center><h1>Deposit Fee</h1></center>
            <h4>Enter Student Username</h4>
            <input type="text" name="uname" placeholder="username" required="Data Required">
            <h4>Enter Amount</h4>
            <input type="text" name="amount" placeholder="amount" required="Data Required">
            <input type="submit" value="Deposit">
        </form>
        
    </div>
    <%@include file="footer.jsp"%>
    </body>
</html>

