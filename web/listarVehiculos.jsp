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
        <title>Listar Vehiculos</title>
    </head>
    <body>


        <table border="1">
            <th>Codigo</th>
            <th>Precio</th>
            <th>modelo</th>
            <th>foto</th>
            <th>año</th>


            <c:forEach items="${allVehiculo}" var="vehi">
                <tr>
                    <th>${vehi.codigo}</th>
                    <th>${vehi.precio}</th>
                    <th>${vehi.modelo}</th>
                    <th><img src="vehiculo/image.html?id=${vehi.codigo}" /></td>
                    <th>${vehi.ano}</th>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>
