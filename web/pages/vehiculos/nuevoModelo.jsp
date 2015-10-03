<%-- 
    Document   : nuevoVenta
    Created on : 3/10/2015, 12:55:48 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/formulario.css" />
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
                        <th> Nombre</th>
                        <th> <input type="text" name="nombre" value="${modeloVehiculo.nombre}" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th>Tipo</th>
                        <th><input type="text" name="tipo" value="${modeloVehiculo.tipo}" required="true" size="" /> </th>
                    </tr>                    
                    <tr>

                        <th><button type="reset" name="action" >Cancelar</button></th>
                        <th><button type="submit" name="action" value="Add">Guardar</button></th>

                        </td>
                    </tr>
                </table>
            </form>

        </div>
    </body>
</html>
