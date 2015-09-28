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
    <body>
        <div id="principal">
            <div id="header">
                <div id="logo"><p style="float:left;margin:30px 0 0 28%;">Carros</p><p style="float:right;
                                                                                       margin:30px 28% 0 0;">Udea</p></div>
                <div id="menu">
                    <nav>
                        <ul class="menu">
                            <li><a href="#"><i class="icon-home"></i>HOME</a>
                                <ul class="sub-menu">
                                    <li><a href="#">Sub-Menu 1</a></li>
                                    <li><a href="#">Sub-Menu 2</a></li>
                                    <li><a href="#">Sub-Menu 3</a></li>
                                </ul>
                            </li>
                            <li><a href="#"><i class="icon-user"></i>ABOUT</a></li>
                            <li><a href="#"><i class="icon-camera"></i>PORTFOLIO</a>
                                <ul class="sub-menu">
                                    <li><a href="#">Sub-Menu 1</a></li>
                                    <li><a href="#">Level 3 Menu</a>
                                        <ul>
                                            <li><a href="#">Sub-Menu 4</a></li>
                                            <li><a href="#">Sub-Menu 5</a></li>
                                            <li><a href="#">Sub-Menu 6</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="#"><i class="icon-bullhorn"></i>BLOG</a></li>
                            <li><a href="#"><i class="icon-envelope-alt"></i>CONTACT</a></li>
                        </ul>
                    </nav>
                </div>
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
