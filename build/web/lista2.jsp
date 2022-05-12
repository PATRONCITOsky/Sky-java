<%-- 
    Document   : usuario
    Created on : 22/11/2021, 03:58:00 PM
    Author     : SENA
--%>

<%@page import="beens.registroBeensP"%>
<%@page import="DAO.registroDAOP"%>
<%@page import="beens.registroBeens"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.registroDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="css/global2.css" type="text/css">
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">


                <div class="col-sm-9 main-col">
                    <%--<form action="ControladorU?menu=usuario" method="POST">
                        
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <label>Nombre</label>
                                <input type="text" value="${usuario.getNombres()}" name="txtNombres" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Contacto</label>
                                <input type="text" value="${usuario.getContacto()}" name="txtContacto" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Correo</label>
                                <input type="text" value="${usuario.getCorreo()}" name="txtCorreo" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Password</label>
                                <input type="text" value="${usuario.getPassword()}" name="txtClave" class="form-control">
                            </div>
                    <%-- <div class="col-sm-3">
                        <label>Password</label>
                        <input type="text" value="${usuario.get()}" name="txt" class="form-control">
                    </div>    
                </div>
                
                <button type="submit" name="accion" value="insertar" class="btn btn-outline-success">
                            <i class="fas fa-user-plus"></i> Guardar
                        </button>
                        
                        <button type="submit" name="accion" value="modifica" class="btn btn-outline-warning">
                            <i class="fas fa-edit"></i> Modificar
                        </button>
            </form> --%>

                    <input class="form-control" id="myInput" type="text" placeholder="Ingrese el nombre del producto">
                    <br>
                    <table class="table table-dark table-hover" id="myTable">
                        <tr>

                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Costo</th>
                            <th>Descripcion</th>
                            <th>Cantidad</th>
                            <th>Estado</th>
                            <th>Id_Categoria</th>

                        </tr>
                        <%
                            List lis2 = new registroDAOP().getAll();
                            ListIterator list2 = lis2.listIterator();
                            while (list2.hasNext()) {
                                registroBeensP regM = (registroBeensP) list2.next();

                        %> 

                        <tr>

                            <td><%= regM.getId()%></td>
                            <td><%= regM.getNombres()%></td>
                            <td><%= regM.getCosto()%></td>
                            <td><%= regM.getDescripcion()%></td>
                            <td><%= regM.getCantidad()%></td>
                            <td><%= regM.getEstado()%></td>
                            <td><%= regM.getId_categoria()%></td>


                        </tr>

                        <%
                            }
                        %>

                    </table>
                </div>
            </div>
        </div>
        <script src="js/busqueda.js" type="text/javascript"></script>
    </body>
</html>
