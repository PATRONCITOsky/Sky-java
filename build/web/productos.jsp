<%-- 
    Document   : usuario
    Created on : 22/11/2021, 03:58:00 PM
    Author     : SENA
--%>

<%@page import="DAO.registroDAOPC"%>
<%@page import="DAO.registroDAOP"%>
<%@page import="beens.registroBeensPC"%>
<%@page import="beens.registroBeensP"%>
<%@page import="controlador.ControladorPC"%>
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
        <%@include file="commons/CabeceraUsr.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 sidebar-col">
                    <%@include file="commons/sideBar.jsp" %>
                </div>
                
                <div class="col-sm-9 main-col">
                    <form action="Cproductos?menu=usuario" method="POST" enctype="multipart/form-data">
                        
                        <div class="form-group d-flex">
                            <div class="col-sm-2">
                                <label>Nombres</label>
                                <input type="text" value="${usuario.getNombres()}" name="txtNombres" class="form-control">
                            </div>
                            <div class="col-sm-2">
                                <label>Costo</label>
                                <input type="text" value="${usuario.getCosto()}" name="txtCosto" class="form-control">
                            </div>
                            <div class="col-sm-4">
                                <label>Descripcion</label>
                          
                                <input type="text" value="${usuario.getDescripcion()}" name="txtDescripcion" class="form-control">
                               
                            </div>
                            <div class="col-sm-2">
                                <label>Cantidad</label>
                                <input type="text" value="${usuario.getCantidad()}" name="txtCantidad" class="form-control">
                            </div>
                            <div class="col-sm-2">
                                <label>Seleccionar categoria</label>
                                <select name="produ_catego_id" class="form">
                                    <% 
                                        List lis = new registroDAOPC().getAll();
                                        ListIterator list = lis.listIterator();
                                        while (list.hasNext()){
                                        registroBeensPC li = (registroBeensPC) list.next();
                                        
                                    %>
                                    <option value="<%= li.getId()%>"> <%= li.getNombre() %>
                                        
                                    </option>
                                    <% 
                                        }
                                    %> 
                                </select>
                            </div>
                            
                        </div>
                                    <div class="col-sm-4">
                                        <label>Imagen</label>
                                        <input type="file" value="${usuario.getImagen()}" name="txtImagen" class="form-control">
                                    </div>
                                    
                                    <br>
                                
                        <button type="submit" name="accion" value="insertar" class="btn btn-outline-success">
                                    <i class="fas fa-user-plus"></i> Guardar
                                </button>
                                
                                <button type="submit" name="accion" value="modifica" class="btn btn-outline-warning">
                                    <i class="fas fa-edit"></i> Modificar
                                </button>
                    </form>
               
                     <h1>Lista de Productos</h1>
                     <%@include file="lista.jsp" %>
                    
        
    </body>
</html>
