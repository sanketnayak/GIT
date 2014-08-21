<%-- 
    Document   : task
    Created on : Aug 19, 2014, 4:53:19 PM
    Author     : sanketnayak
--%>

<%@page import="java.util.List"%>
<%@page import="com.myapp.struts.Task"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.myapp.struts.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        table, td, th {
            border: 1px solid green;
        }

        th {
            background-color: green;
            color: white;
        }
    </style>
    <body>
        <div>
            <form method="get" action="http://localhost:8081/TaskManager/TaskAction2.do">
                Task ID : <input type="text" name="id"><br><br><br>
                <textarea type="text" name="task" maxlength="150">Write Task Here</textarea><br><br><br>
                <input type="submit" value="Submit Task"><br><br><br>
            </form>
        </div>
        
        <div>
            <table>
                <thead>
                    <td>Task ID</td>
                    <td>Task</td>
                </thead>
                <tbody>
                <%
                    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                    Session sess = sessionFactory.openSession();
                    List<Task> tasks = sess.createCriteria(Task.class).list();
                    
                    for (Task t : tasks) {
                        out.println("<tr>");
                        out.println("<td>"+t.getId()+"</td>");
                        out.println("<td>"+t.getTask()+"</td>");
                        out.println("</tr>");
                    }
                 %>
                </tbody>
            </table>
        </div>
    </body>
</html>
