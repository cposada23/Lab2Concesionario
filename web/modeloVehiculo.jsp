<%-- 
    Document   : modeloVehiculo
    Created on : 28/09/2015, 05:02:50 PM
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
        <h1>Modelos </h1>
        <form action="./ModeloVehiculoServlet" method="POST">
        <table>
            <tr>
                <th> Codigo modelo</th>
                <th><input type="text" name="codigo" value="${modeloVehiculo.codigo}"/> </th>
            </tr>
            <tr>
                <th> Nombre</th>
                 <th> <input type="text" name="nombre" value="${modeloVehiculo.nombre}"/></th>
            </tr>
             <tr>
                <th>Tipo</th>
                 <th><input type="text" name="tipo" value="${modeloVehiculo.tipo}"/> </th>
            </tr>
             
             <tr>
                 <td colspan="2">
                 <input type="submit" name="action" value="Add"/>
                 <input type="submit" name="action" value="Edit"/>
                 <input type="submit" name="action" value="Delete"/>
                 <input type="submit" name="action" value="Search"/>
                 
                 </td>
             </tr>
            
        </table>
            </form>
            <br>
            
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
