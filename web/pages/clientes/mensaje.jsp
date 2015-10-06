<%-- 
    Document   : mensaje
    Created on : 6/10/2015, 01:05:35 PM
    Author     : camilo.posadaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/formulario.css" />
    </head>
    <body>
        <table>
            <tr>
                <th> Estado</th>
                <th>${mensaje} </th>
            </tr>
            
            <tr>
                <th> Documento Cliente</th>
                <th>${cliente.documento}</th>
            </tr>
            <tr>
                <th> Nombre</th>
                 <th>${cliente.nombre}</th>
            </tr>
             <tr>
                <th>Apelido</th>
                 <th>${cliente.apellido} </th>
            </tr>
             <tr>
                <th> e-mail</th>
                 <th> ${cliente.email}</th>
            </tr>
            <tr>
                <th> Telefono</th>
                 <th> ${cliente.telefono}</th>
            </tr>
    </body>
</html>
