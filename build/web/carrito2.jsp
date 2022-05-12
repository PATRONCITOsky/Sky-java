<%-- 
    Document   : carrito2
    Created on : 13/03/2022, 10:36:04 AM
    Author     : h2ver
--%>

<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="css/global.css" type="text/css">

        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="commons/cabeceraCar.jsp" %>

        <div class="container mt-4">
            <div class="w3-container  w3-animate-top">
                <h1 class="titulo">Productos Seleccionados</h1>
                
            </div>
            
            <br>
            <div class="row">
                <div class="col-sm-9">

                    <table class="table table-dark table-hover">
                        <thead>
                            <tr>
                                <th>ITEM</th>
                                <th>NOMBRES</th>
                                <th>DESCRIPCION</th>
                                <th>PRECIO</th>
                                <th>CANTIDDAD</th>
                                <th>SUBTOTAL</th>
                                <th>ACCION</th>

                            </tr>
                        </thead>
                        <tbody>
                            <d:forEach var="car" items="${registroBeensCarrito}">
                                <tr>
                                    <th>${car.getItem()}
                                        <img src="Cimagen?id=${car.getId()}" class="img-fluid" width="100" height="100">
                                    </th>
                                    <th>${car.getNombres()}</th>
                                    <th>${car.getDescripcion()}</th>
                                    <th>${car.getCosto()}</th>
                                    <td>
                                        <input type="hidden" id="idpr" value="${car.getId()}">
                                        <input type="number" id="cantidad" value="${car.getCantidadP()}" class="form-control text-center" min="1">
                                    </td>
                                    <th>${car.getSubtotal()}</th>
                                    <td>
                                        <input type="hidden" id="idp" value="${car.getId()}">

                                        <a href="#" id="btnDelete"  class="btn btn-outline-light bi bi-trash3-fill">Eliminar</a>
                                        
                                    </td>
                                </tr>  
                            </d:forEach>

                        </tbody>
                    </table>
                </div>
                <div class="col-sm-3">
                    <div class="card">
                        <div class="card-header">
                            <h3>Generar compra</h3>
                        </div>
                        <div class="card-body">
                            <label>SubTotal:</label>
                            <input type="text" value="$.${totalcompra}0" readonly="" class="form-control">
                            <label>Descuento:</label>
                            <input type="text" value="$.0.00" readonly="" class="form-control">
                            <label>Total Compra:</label>
                            <input type="text" value="$.${totalcompra}0" readonly="" class="form-control">
                        </div>

                        <div class="card-footer">

                            <a href="#" class="btn btn-outline-success btn-block">Realizar Pago</a>
                            <a href="Ccar?menu=usuario&accion=GenerarC&id=${regM.getId()}" class="btn btn-outline-info btn-block">Generar Compra</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script src="js/function.js" type="text/javascript"></script>

    </body>
</html>
