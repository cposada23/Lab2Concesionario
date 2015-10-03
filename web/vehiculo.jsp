<%-- 
    Document   : vehiculo
    Created on : 3/10/2015, 09:30:57 AM
    Author     : ElMarto
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
        <h1>Vehiculos </h1>
        <form action="./VehiculoServlet" method="POST" enctype="multipart/form-data">
        <table>
            <tr>
                <th> Codigo Vehiculo</th>
                <th><input type="text" name="codigo" value="${Vehiculo.codigo}"/> </th>
            </tr>
            <tr>
                <th> Precio</th>
                 <th> <input type="text" name="precio" value="${Vehiculo.precio}"/></th>
            </tr>
             <tr>
                <th> codigo modelo</th>
                 <th> <input type="text" name="modelo" value="${Vehiculo.modelo}"/></th>
            </tr>
             <tr>
                <th>Año</th>
                 <th><input type="text" name="ano" value="${Vehiculo.ano}"/> </th>
            </tr>
               <tr>
                        <td>Portrait Photo: </td>
                        <td><br><input type="file" name="photo" size="50"/></td>
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
                <th>Codigo</th>
                <th>Precio</th>
                <th>modelo</th>
                <th>foto</th>
                
                
                <c:forEach items="${allVehiculo}" var="vehi">
                    <tr>
                        <td>${vehi.codigo}</td>
                        <td>${vehi.precio}</td>
                        <td>${vehi.modelo}</td>
                        <td><img src="vehiculo/image.html?id=${vehi.codigo}" /></td>
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>
