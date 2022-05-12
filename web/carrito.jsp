<%-- 
    Document   : productos
    Created on : 10/12/2021, 02:27:12 PM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="css/global3.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body style="background-color: black">
        <%@include file="commons/cabeceraPrd.jsp" %>

        <div class="container">
            <div class="w3-container w3-center w3-animate-top">
                <h1 class="titulo text-center blanco">Productos</h1>
                <h5 class="blanco">Escoge tus productos favoritos</h5>
                
            </div>

            <br>
            <div class="row">
                <c:forEach var="regM" items="${registroBeensP}">
                    <div  class="col-sm-3">
                        
                        <div  class="card text-center">
                            <div class="card-header text-center">
                                <label class="font-weight-bold">${regM.getNombres()}</label>
                            </div>
                            <div class="card-body text-center">
                                <i>Precio: ${regM.getCosto()}</i>
                                <img src="Cimagen?id=${regM.getId()}" class="img-fluid" width="200" height="180">
                                
                            </div>
                            <div class="card-footer text-center">



                                <!-- Button to Open the Modal 
                                <a href="Ccar?menu=usuario&accion=descrip&id=<%--${regM.getId()}--%>" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                    Descripción
                                </a>


                                <!-- The Modal 
                                <div class="modal" id="myModal">
                                    <div class="modal-dialog">
                                        <div class="modal-content">

                                            <!-- Modal Header 
                                            <div class="modal-header">
                                                <h4 class="modal-title"><%--${regM.getNombres()}--%></h4>
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            </div>

                                            <!-- Modal body 
                                            <div class="modal-body">
                                                <label><%--${regM.getDescripcion()}--%></label>
                                            </div>

                                            <!-- Modal footer 
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                            </div>

                                        </div>
                                    </div>
                                </div> -->



                                <br>
                                <label>${regM.getDescripcion()}</label>

                                <div>
                                    <!--<a onclick="stopDefAction(event);" href="Ccar?menu=usuario&accion=agregarc&id= <%-- ${regM.getId()}--%>" class="btn btn-outline-info">Agregar</a> -->
                                    <a href="Ccar?menu=usuario&accion=agregarc&id=${regM.getId()}" class="btn btn-outline-info">Agregar</a>
                                    <a href="Ccar?menu=usuario&accion=compra&id=${regM.getId()}" class="btn btn-outline-success">Comprar</a>
                                </div>
                            </div>
                        </div>
                    </div>       

                </c:forEach>

            </div>
        </div>
        <script src="js/evento.js" type="text/javascript"></script>


    </body>
</html>
