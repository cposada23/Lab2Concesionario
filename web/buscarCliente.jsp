<%-- 
    Document   : buscar
    Created on : 6/10/2015, 02:07:44 PM
    Author     : camilo.posadaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informacion de Clientes</h1>
        <form action="./ClienteServlet" method="POST">
        <table>
            <tr>
                <th> Documento Cliente</th>
                <th><input type="text" name="documento" /> </th>
            </tr>
            
             <tr>
                 <td colspan="2">
                    <input type="submit" name="action" value="Search"/>
                    <input type="submit" name="action" value="Edit"/>
                    <input type="submit" name="action" value="Delete"/>
                 </td>
             </tr>
            
        </table>
            </form>
            <br>
            
            <table border="1">
                <th>Documento</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>e-mail</th>
                <th>telefono</th>
                
                
                    <tr>
                        <td>${cliente.documento}</td>
                        <td>${cliente.nombre}</td>
                        <td>${cliente.apellido}</td>
                        <td>${cliente.email}</td>
                        <td>${cliente.telefono}</td>
                    </tr>
                
           </table>
            
    </body>
</html>
