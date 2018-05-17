<%-- 
    Document   : index
    Created on : 17-may-2018, 13:03:28
    Author     : Emanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>MPV MERCA PLAZA</title>
    </head>
    <body>

        <!--Impresion de cadenas con diferentes tecnologias-->
        <ul>
            <li>Hello World!</li>
            <li><%out.println("Hola mundo con Scriptles");%></li>
            <li> ${"Hola mundo con Expression Language (EL)"}</li>
        </ul>

        <ul>
            <li>Hola: <%= new java.util.Date()%></li>
            <li>Acceder al nombre de context de nuestra app osea el ContextPath: <%=request.getContextPath()%></li>
            <li>Valor de un parametro x: <%= request.getParameter("x")%></li>
        </ul>
    </body>
</html>
