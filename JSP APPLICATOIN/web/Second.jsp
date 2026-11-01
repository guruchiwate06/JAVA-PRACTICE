<%-- 
    Document   : Second.jsp
    Created on : 16 Oct 2026, 9:29:00 am
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
        <% 
            String z = (String)session.getAttribute("y");
            out.println(z);
            
            
            %>
    </body>
</html>
