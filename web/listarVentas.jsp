<%-- 
    Document   : listar
    Created on : 3/10/2015, 05:14:46 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./VentasServlet" method="POST">
                 <input type="submit" name="action" value="Listar"/>
            </form>
        <table border="1">
            <th>Codigo Venta</th>
            <th>Fecha</th>
            <th>Matricula</th>
            <th>Codigo Vehiculo</th>
            <th>Documento Cliente</th>
            <th>Documento Vendedor</th>

            <c:forEach items="${a}" var="ven">
                <tr>
                    <th>${ven.codigo}</th>
                    <th>${ven.fecha}</th>
                    <th>${ven.matricula}</th>
                    <th>${ven.vehiculo}</th>
                    <th>${ven.cliente}</th>
                    <th>${ven.vendedor}</th>
                </tr>
            </c:forEach>
        </table>
                <h1>${mensaje}</h1>
    </body>
</html>
