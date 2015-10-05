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


        <table border="1">
            <th>Documento</th>
            <th>Nombre</th>
            <th>Tipo</th>
 

            <c:forEach items="${allModelos}" var="model">
                <tr>
                    <td>${model.codigo}</td>
                    <td>${model.nombre}</td>
                    <td>${model.tipo}</td>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>
