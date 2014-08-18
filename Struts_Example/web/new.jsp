<%-- 
    Document   : new
    Created on : Aug 17, 2014, 4:37:38 PM
    Author     : sanketnayak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:errors></html:errors>
        <bean:message key="label1"/>
        <form method="get" action="http://localhost:8080/Struts_Example/A1.do">           
            Username:<input type="text" name="username"><br>
            Password: <input type="password" name="pwd">
            <input type="submit" value="Go">
        </form>
    </body>
</html>
