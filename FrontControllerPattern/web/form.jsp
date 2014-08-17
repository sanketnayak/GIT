<%@page import="com.org.sanket.UserForm"%>
<% 
            HttpSession s = request.getSession();
            UserForm f = (UserForm) s.getAttribute("form");
            if(f==null) {
                out.println("Hello");
            } else if (f.validated == false) {
                 out.println("<b>Invalid Credentials. Try again");
            } 
           %>