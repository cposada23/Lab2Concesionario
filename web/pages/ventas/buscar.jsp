<%-- 
    Document   : buscar
    Created on : 5/10/2015, 12:15:49 PM
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                        <th><button type="submit" name="action" value="Buscar">Buscar</button></th>
                        <th><button type="reset" value="Cancelar" name="Cancelar">Cancelar</button></th>
                    </tr>

                </table>
            </form>
           <table border="1">
            <th>Codigo Venta</th>
            <th>Fecha</th>
            <th>Matricula</th>
            <th>Codigo Vehiculo</th>
            <th>Documento Cliente</th>
            <th>Documento Vendedor</th>

            <c:forEach items="${allVendedores}" var="ven">
                <tr>
                    <th>${ven.codigo}</th>
                    <th>${ven.fecha}</th>
                    <th>${ven.matricula}</th>
                    <th>${ven.vehiculo}</th>
                    <th>${ven.cliente}</th>
                    <th>${ven.vendedor}</th>
                </tr>
            </c:forEach>
        </table>
    
        </div>
    </body>
</html>
