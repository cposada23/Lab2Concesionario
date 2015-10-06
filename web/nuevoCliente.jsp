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
            <form action="./ClienteServlet" method="POST">
                <table>
                    <tr>
                        <th> Documento Cliente</th>
                        <th><input type="number" name="documento" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th> Nombre</th>
                        <th> <input type="text" name="nombre" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th>Apelido</th>
                        <th><input type="text" name="apellido" value="" required="true" size=""/> </th>
                    </tr>
                    <tr>
                        <th> e-mail</th>
                        <th> <input type="email" name="email" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th> Telefono</th>
                        <th> <input type="tel" name="telefono" value="" required="true" size=""/></th>
                    </tr>
                    <tr>
                        <th><button type="submit" name="action" value="add">Guardar</button></th>
                        <th><button type="reset" value="Cancelar" name="Cancelar">Cancelar</button></th>
                    </tr>

                </table>
            </form>
        </div>
    </body>
</html>
