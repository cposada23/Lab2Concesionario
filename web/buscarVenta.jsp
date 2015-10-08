<%-- 
    Document   : buscarVenta
    Created on : 7/10/2015, 11:35:36 AM
    Author     : camilo.posadaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="formu">
            <form action="./VentasServlet" method="POST">
                <table>
                    <tr>
                        <th> Codigo matricula</th>
                        <th><input type="text" name="matricula" required="true" size=""/> </th>
                    </tr>    
                    <tr>
                        <th><button type="submit" name="action" value="Search">Buscar</button></th>
                        <th><button type="reset" >Cancelar</button></th>
                        

                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <table border="1">
            <th>Codigo Venta</th>
            <th>Fecha</th>
            <th>Matricula</th>
            <th>Codigo Vehiculo</th>
            <th>Documento Cliente</th>
            <th>Documento Vendedor</th>
            <th>Foto vehiculo</th>

            
                <tr>
                    <th>${venta.codigo}</th>
                    <th>${venta.fecha}</th>
                    <th>${venta.matricula}</th>
                    <th>${venta.vehiculo}</th>
                    <th>${venta.cliente}</th>
                    <th>${venta.vendedor}</th>
                    <th><img src="vehiculo/image.html?id=${venta.vehiculo}" /></td>
                </tr>
            
        </table>
                <h1>${mensaje}</h1>
    </body>
</html>
