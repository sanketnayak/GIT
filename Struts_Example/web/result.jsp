<%-- 
    Document   : result
    Created on : Aug 17, 2014, 8:43:46 PM
    Author     : sanketnayak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(request.getParameter("q1").contentEquals("msd")) {
                out.println("You answered correctly");
            } else
            {
                out.println("You answered wrong");
            }
        %>
    </body>
</html>
