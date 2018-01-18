<%-- 
    Document   : detail
    Created on : Jan 18, 2018, 12:11:28 AM
    Author     : Nandan Raj
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    table ,tr ,td,th{
        border: 1px solid black;
        padding: 3px;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@include file="accountantHeader.jsp"%>
        <center><h1>All Students</h1></center>
        
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage","root","root");
    PreparedStatement pt=con.prepareStatement("select * from reg where staff='0'");
    ResultSet rs=pt.executeQuery();
    
    
%>        
      
        <div style="margin-top: 50px; margin-left: 100px;margin-bottom: 50px">
            <table>
                <tr>
                    <th><b>Username</b></th>
                    <th><b>Name</b></th>
                    <th><b>Class</b></th>
                    <th><b>Phone</b></th>
                    <th><b>Fee</b></th>
                </tr>
                <%while(rs.next()){%>        
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                    <td><%=rs.getString(7)%></td>
                    
                </tr>
                <%}con.close();%>
            </table>
                    
        </div>
            <hr>
            <center><h1>Delete Student:</h1></center>
            <form action="Delete">
                <div style="margin-left: 100px">
                <p>Enter Username</p>
                <input type="text" name="uname" placeholder="username"required="Data Required">
                <input type="submit" value="Delete">
                </div>
            </form>
            <%@include file="footer.jsp"%>
    </body>
</html>
