<%-- 
    Document   : vendedor
    Created on : 27/09/2015, 07:57:19 PM
    Author     : cposa
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
        <h1>Vendedores</h1>
        <form action="./VendedorServlet" method="POST">
        <table>
            <tr>
                <th> Documento Cliente</th>
                <th><input type="text" name="documento" value="${vendedor.documento}"/> </th>
            </tr>
            <tr>
                <th> Nombre</th>
                 <th> <input type="text" name="nombre" value="${vendedor.nombre}"/></th>
            </tr>
             <tr>
                <th>Apelido</th>
                 <th><input type="text" name="apellido" value="${vendedor.apellido}"/> </th>
            </tr>
             <tr>
                <th> e-mail</th>
                 <th> <input type="text" name="email" value="${vendedor.email}"/></th>
            </tr>
            <tr>
                <th> Telefono</th>
                 <th> <input type="text" name="telefono" value="${vendedor.telefono}"/></th>
            </tr>
             <tr>
                 <td colspan="2">
                 <input type="submit" name="action" value="Add"/>
                 <input type="submit" name="action" value="Edit"/>
                 <input type="submit" name="action" value="Delete"/>
                 <input type="submit" name="action" value="Search"/>
                 
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
                <th>foto</th>
                
                <c:forEach items="${allVendedores}" var="ven">
                    <tr>
                        <td>${ven.documento}</td>
                        <td>${ven.nombre}</td>
                        <td>${ven.apellido}</td>
                        <td>${ven.email}</td>
                        <td>${ven.telefono}</td>
                        
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>
