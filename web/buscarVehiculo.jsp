<%-- 
    Document   : buscar
    Created on : 5/10/2015, 12:40:19 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar vehiculo</title>
    </head>
    <body>
        <div class="formu">
            <form action="./ModeloVehiculoServlet" method="POST">
                <table>
                    <tr>
                        <th> Codigo modelo</th>
                        <th><input type="text" name="codigo" value="${modeloVehiculo.codigo}" required="true" size=""/> </th>
                    </tr>    
                    <tr>

                        <th><button type="reset" name="Buscar">Buscar</button></th>
                        <th><button type="submit" name="action" value="Add">Guardar</button></th>

                        </td>
                    </tr>
                </table>
            </form>
        </div>
                    
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
