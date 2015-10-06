<%-- 
    Document   : listar
    Created on : 3/10/2015, 05:14:46 PM
    Author     : alejandro
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
                 <input type="submit" name="action" value="Listar"/>
            </form>
            <br>
        <table border="1">
                <th>Documento</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>e-mail</th>
                <th>telefono</th>
                
                
                <c:forEach items="${allClientes}" var="ven">
                    <tr>
                        <th>${ven.documento}</th>
                        <th>${ven.nombre}</th>
                        <th>${ven.apellido}</th>
                        <th>${ven.email}</th>
                        <th>${ven.telefono}</th>
                        <th><input /></th>
                        
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>
