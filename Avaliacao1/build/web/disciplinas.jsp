<%-- 
    Document   : disciplinas
    Created on : 12 de abr. de 2021, 10:42:08
    Author     : easypc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <%

if (request.getParameter("session")!=null){
        session.setAttribute("nameS", request.getParameter("nameS"));
        response.sendRedirect(request.getRequestURI());
    }
if (request.getParameter("disciplinas")!=null){
        session.setAttribute("p1", request.getParameter("n1"));
        session.setAttribute("p2", request.getParameter("n2"));
        //response.sendRedirect(request.getRequestURI());
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
    <table width=100% border="1">
        <form>
                <th>Engenharia de Software III</th>
                <th>Gestão de Projetos</th>
                <th>Programação Orientada a Objetos</th>
                <th>NOTA P1</th>
                <th>NOTA P2</th>
            </tr>
            <tr>
                <th>Economia e finanças</th>
                <th>Estatistica Aplicada</th>
                <th>Matematica Discreta</th>
                <th><input type="number" min="0" max="10" name="n1"></th>
                <th><input type="number" min="0" max="10" name="n2"></th>
            </tr>
            <tr>
                <th></th>
                <th></th>
                <th><input type="submit" name="disciplinas" value="ENVIAR"></th>
                <th></th>
                <th></th>
            </tr>
        </forms>
        </table>
    </body>
</html>
