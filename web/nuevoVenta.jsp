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
        <link rel="stylesheet" type="text/css" href="css/formulario.css" />
    </head>
    <body>
        <div class="formu">
            <form action="" method="POST">
                <table>
                    <tr>
                        <th> Codigo Venta</th>
                        <th><input type="number" name="codigo" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th> fecha</th>
                        <th> <input type="date" name="fecha" value="" required="true" size="50"/></th>
                    </tr>
                    <tr>
                        <th>Matricula</th>
                        <th><input type="text" name="matricula" value="" required="true" size="50"/> </th>
                    </tr>
                    <tr>
                        <th>Codigo Vehiculo</th>
                        <th> <input type="number" name="vehiculo" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th>Documento Cliente </th>
                        <th> <input type="number" name="cliente" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th>Documento Vendedor </th>
                        <th> <input type="number" name="vendedor" value="" required="true" size=""/></th>
                    </tr>                    
                    <tr>
                        <th><button type="submit" name="action" value="Guardar">Guardar</button></th>
                        <th><button type="reset" value="Cancelar" name="Cancelar">Cancelar</button></th>
                    </tr>

                </table>
            </form>

        </div>
    </body>
</html>
