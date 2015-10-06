<%-- 
    Document   : editar
    Created on : 5/10/2015, 12:44:55 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <div class="formu">
            <form action="./VehiculoServlet" method="POST" enctype="multipart/form-data">
                <table>
                    <tr>
                        <th> Codigo Vehiculo</th>
                        <th><input type="number" name="codigo" value="${Vehiculo.codigo}"required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th> Precio</th>
                        <th> <input type="number" name="precio" value="${Vehiculo.precio}" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th> codigo modelo</th>
                        <th> <input type="number" name="modelo" value="${Vehiculo.modelo}" required="true" size="" /></th>
                    </tr>
                    <tr>
                        <th>Año</th>
                        <th><input type="text" name="ano" value="${Vehiculo.ano}" required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th>Portrait Photo: </th>
                        <th><br><input type="file" name="photo" accept="image/*" required="true" size="50"/></th>
                    </tr>

                    <tr>
                        <th><button type="submit" name="action" value="Add">Guardar</button></th>
                    </tr>

                </table>
            </form>

        </div>
    </body>
</html>
