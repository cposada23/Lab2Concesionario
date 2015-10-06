<%-- 
    Document   : nuevoVenta
    Created on : 3/10/2015, 12:55:48 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/formulario.css" />
    </head>
    <body>
        <div class="formu">
            <form action="./VehiculoServlet" method="POST" enctype="multipart/form-data">
                <table>
                    <tr>
                        <th> Codigo Vehiculo</th>
                        <th><input type="number" name="codigo" required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th> Precio</th>
                        <th> <input type="number" name="precio"  required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th> codigo modelo</th>
                        <th> <input type="number" name="modelo"  required="true" size="" /></th>
                    </tr>
                    <tr>
                        <th>Año</th>
                        <th><input type="text" name="ano"  required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th>Portrait Photo: </th>
                        <th><br><input type="file" name="photo" accept="image/*" required="true" size="50"/></th>
                    </tr>

                    <tr>
                        <th><button type="reset" name="action" >Cancelar</button></th>
                        <th><button type="submit" name="action" value="Add">Guardar</button></th>
                    </tr>

                </table>
            </form>

        </div>
    </body>
</html>
