<%-- 
    Document   : eliminar
    Created on : 5/10/2015, 12:52:10 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elminar vehiulo</title>
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
                        <th><button type="submit" name="action" value="Add">Eliminar</button></th>
                    </tr>

                </table>
            </form>
        </div>
    </body>
</html>
