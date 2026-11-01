<%-- 
    Document   : Arithmetic
    Created on : 14 Oct 2026, 2:12:21 pm
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
        <h1>Hello World!</h1>
         <form action="Arithmetic.jsp" method="GET">
            Enter the first number:
            <input type="text" name="t1"><br>
            Enter the second number:
            <input type="text" name="t2"><br>
            
            <input type="submit" name="add">
            <% 
                String x = request.getParameter("t1");
                String y = request.getParameter("t2");
                if(x!=null && y!=null){
                int a = Integer.parseInt(x);
                int b = Integer.parseInt(y);
                int c = a+b;
                
            %>
            <h3> Sum = <%=c %> </h3>
            
            <%
                }
            %>
        </form>
    </body>
</html
