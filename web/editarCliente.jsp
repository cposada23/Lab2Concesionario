<%-- 
    Document   : editarCliente
    Created on : 7/10/2015, 12:09:10 PM
    Author     : camilo.posadaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <th><input type="text" name="documento" value="${cliente.documento}"/> </th>
            </tr>
            <tr>
                <th> Nombre</th>
                 <th> <input type="text" name="nombre" value="${cliente.nombre}"/></th>
            </tr>
             <tr>
                <th>Apelido</th>
                 <th><input type="text" name="apellido" value="${cliente.apellido}"/> </th>
            </tr>
             <tr>
                <th> e-mail</th>
                 <th> <input type="text" name="email" value="${cliente.email}"/></th>
            </tr>
            <tr>
                <th> Telefono</th>
                 <th> <input type="text" name="telefono" value="${cliente.telefono}"/></th>
            </tr>
             <tr>
                 <td colspan="2">
                
                 <input type="submit" name="action" value="Edit"/>
                 <input type="submit" name="action" value="Search"/>
                 
                 </td>
             </tr>
            
        </table>
        </form>
            <h1>${mensaje}</h1>
    </body>
</html>
