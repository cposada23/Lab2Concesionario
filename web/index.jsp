<%-- 
    Document   : index
    Created on : 28/09/2015, 05:04:06 PM
    Author     : jalejandro.berrio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body class="index">
        <div id="principal">
            <div id="header">
                <div id="logo"><p style="float:left;margin:30px 0 0 28%;">Carros</p><p style="float:right;
                                                                                       margin:30px 28% 0 0;">Udea</p></div>
                <div id="menu">
                    <nav>
                        <ul class="menu">
                            <li><a href="#"><i class="icon-home"></i>VENTAS</a>
                                <ul class="sub-menu">
                                    <li><a href="pages/ventas/nuevoVenta.jsp" target="web-view">Nueva</a></li>
                                    <li><a href="#">Buscar</a></li>
                                    <li><a href="#">Listar todos</a></li>
                                </ul>
                            </li>
                            <li><a href="#"><i class="icon-camera"></i>CLIENTE</a>
                                <ul class="sub-menu">
                                    <li><a href="pages/clientes/nuevoCliente.jsp" target="web-view">Nuevo</a></li>
                                    <li><a href="#">Buscar</a></li>
                                    <li><a href="#">Editar</a></li>
                                    <li><a href="#">Compras por cliente</a></li>
                                    <li><a href="#">Listar todos</a></li>
                                </ul>
                            </li>                            
                            <li><a href="#"><i class="icon-camera"></i>VENDEDOR</a>
                                <ul class="sub-menu">
                                    <li><a href="pages/vendedor/nuevoVendedor.jsp" target="web-view">Nuevo</a></li>
                                    <li><a href="#">Buscar</a></li>
                                    <li><a href="#">Editar</a></li>
                                    <li><a href="#">Ventas por vendedor</a></li>
                                    <li><a href="pages/vendedor/listar.jsp" target="web-view">Listar todos</a></li>
                                </ul>
                            </li>
                            <li><a href="#"><i class="icon-camera"></i>VEHICULOS</a>
                                <ul class="sub-menu">
                                    <li><a href="pages/vehiculos/nuevoVehiculo.jsp" target="web-view">Nuevo</a></li>
                                    <li><a href="pages/vehiculos/nuevoModelo.jsp" target="web-view">Nuevo Modelo</a></li>
                                    <li><a href="#">Buscar</a></li>
                                    <li><a href="#">Editar</a></li>
                                    <li><a href="#">Eliminar</a></li>
                                    <li><a href="#">Listar todos</a></li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
                <div id="contenido">
                    <iframe id="web-view"  name="web-view" src=""/>
                </div>
        </div>

        <script type="text/javascript">
            $(document).ready(function () {
                var touch = $('#touch-menu');
                var menu = $('.menu');

                $(touch).on('click', function (e) {
                    e.preventDefault();
                    menu.slideToggle();
                });
                $(window).resize(function () {
                    var w = $(window).width();
                    if (w > 767 && menu.is(':hidden')) {
                        menu.removeAttr('style');
                    }
                });
            });
        </script>
    </body>
</html>
