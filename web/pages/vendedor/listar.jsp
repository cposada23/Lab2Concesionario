<%-- 
    Document   : listar
    Created on : 3/10/2015, 05:18:08 PM
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
        <c:forEach items="${allVendedores}" var="ven">
                    <tr>
                        <th>${ven.documento}</th>
                        <th>${ven.nombre}</th>
                        <th>${ven.apellido}</th>
                        <th>${ven.email}</th>
                        <th>${ven.telefono}</th>
                    </tr>
                </c:forEach>
    </body>
</html>
