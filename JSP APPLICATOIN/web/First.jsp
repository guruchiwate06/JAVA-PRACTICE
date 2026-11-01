<%-- 
    Document   : First.jsp
    Created on : 16 Oct 2026, 9:28:46 am
    Author     : Rajguru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First file</h1>
        <% 
        String x = "Hi World!!";
        session.setAttribute("y",x);
        response.sendRedirect("Second.jsp");
        %>
    </body>
</html>
