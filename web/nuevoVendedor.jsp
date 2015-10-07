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
            <form action="./VendedorServlet" method="POST">
                <table>
                    <tr>
                        <th> Documento vendedor</th>
                        <th><input type="number" name="documento"  required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th> Nombre</th>
                        <th> <input type="text" name="nombre"  required="true" size="" /></th>
                    </tr>
                    <tr>
                        <th>Apelido</th>
                        <th><input type="text" name="apellido" required="true" size="" /> </th>
                    </tr>
                    <tr>
                        <th> e-mail</th>
                        <th> <input type="email" name="email"  required="true" size="" /></th>
                    </tr>
                    <tr>
                        <th> Telefono</th>
                        <th> <input type="tel" name="telefono" required="true" size="" /></th>
                    </tr>
                    <tr>

                        <th><button type="reset" name="action" >Cancelar</button></th>
                        <th><button type="submit" name="action" value="Add">Guardar</button></th>

                        </td>
                    </tr>

                </table>
                    <h1>${mensaje} </h1>
            </form>
        </div>
                    
    </body>
</html>