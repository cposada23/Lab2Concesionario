<%-- 
    Document   : ventas
    Created on : 3/10/2015, 02:40:36 PM
    Author     : camilo.posadaa
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
        <h1>Ventas </h1>
        <form action="./VentasServlet" method="POST" >
            <table>
                <tr>
                    <th> Codigo Venta</th>
                    <th><input type="text" name="codigo" value="${Venta.codigo}"/> </th>
                </tr>
                <tr>
                    <th> fecha</th>
                     <th> <input type="text" name="fecha" value="${Venta.fecha}"/></th>
                </tr>
                 <tr>
                    <th> matricula</th>
                     <th> <input type="text" name="matricula" value="${Venta.matricula}"/></th>
                </tr>
                 <tr>
                    <th>Codigo vendedor</th>
                     <th><input type="text" name="vendedor" value="${Venta.vendedor}"/> </th>
                </tr>
                <tr>
                    <th> Codigo cliente</th>
                     <th><input type="text" name="cliente" value="${Venta.cliente}"/> </th>
                </tr>
                <tr>
                    <th> Codigo vehiculo</th>
                     <th><input type="text" name="vehiculo" value="${Venta.vehiculo}"/> </th>
                </tr>


                 <tr>
                     <td colspan="2">
                     <input type="submit" name="action" value="Add"/>
                     <input type="submit" name="action" value="Search"/>
                     </td>
                 </tr>

            </table>
        </form>
            <br>
            
            <table border="1">
                <th>Codigo Venta</th>
                <th>Fecha</th>
                <th>matricula</th>
                <th>Codigo Vehiculo</th>
                <th>Codigo Cliente</th>
                <th>Codigo Vendedor</th>
                
                
                <c:forEach items="${allventas}" var="vent">
                    <tr>
                        <td>${vent.codigo}</td>
                        <td>${vent.fecha}</td>
                        <td>${vent.matricula}</td>
                        <td>${vent.vehiculo}</td>
                        <td>${vent.cliente}</td>
                        <td>${vent.vendedor}</td>
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>

