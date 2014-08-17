<%-- 
    Document   : frontPage
    Created on : Aug 13, 2014, 12:37:55 AM
    Author     : sanketnayak
--%>

<%@page import="com.org.sanket.UserForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Welcome <% ((UserForm) request.getSession().getAttribute("form")).getUsername(); %></title>
    </head>
    <body>
        <h1>Welcome <% 
            HttpSession s = request.getSession();
            UserForm f = (UserForm) s.getAttribute("form");
            out.println(" "+f.getUsername());
           %></h1>
        <a href="action1.do">Entry 1</a>
        <a href="action2.do">Entry 2</a>
        <a href="action3.do">Entry 3</a>
    </body>
</html>
