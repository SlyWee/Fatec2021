<%-- 
    Document   : index
    Created on : 12 de abr. de 2021, 10:11:16
    Author     : easypc
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

if (request.getParameter("session")!=null){
        session.setAttribute("nameS", request.getParameter("nameS"));
        response.sendRedirect(request.getRequestURI());
    }
if (request.getParameter("logout")!=null){
        session.removeAttribute("nameS");
        response.sendRedirect(request.getRequestURI());
    }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h3>1290481712034|Wesley Munhoz Brandão|primeiro semestre de 2017<p></h3>
        <h3>Link para o github: <a href="https://github.com/SlyWee/Fatec2021/">github.com/SlyWee/Fatec2021</a><h3>
    </body>
</html>
