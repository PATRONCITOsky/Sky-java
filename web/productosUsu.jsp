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
                    <%@include file="commons/sideBar2.jsp" %>
                </div>
                
                <div class="col-sm-9 main-col">
                    
               
                     <h1>Lista de Productos</h1>
                     <%@include file="lista2.jsp" %>
                    <%-- <table class="table table-bordered">
                        <tr>
                            
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Costo</th>
                            <th>Descripcion</th>
                            <th>Cantidad</th>
                            <th>Estado</th>
                            <th>Id_Categoria</th>
                            <th>Actualizar</th>
                            <th>Eliminar</th>
                        </tr>
                        <% 
                            List lis2 = new registroDAOP().getAll();
                            ListIterator list2 = lis2.listIterator();
                            while(list2.hasNext()){
                                registroBeensP regM = (registroBeensP)list.next();
                            
                        %> 
                        
                        <tr>
                            
                            <td><%= regM.getId() %></td>
                            <td><%= regM.getNombres() %></td>
                            <td><%= regM.getCosto() %></td>
                            <td><%= regM.getDescripcion() %></td>
                            <td><%= regM.getCantidad() %></td>
                            <td><%= regM.getEstado() %></td>
                            <td><%= regM.getId_categoria() %></td>
                            <td><a class="btn btn-outline-success" href="Cproductos?menu=usuario&accion=actualizar&id=<%=regM.getId()%>">Actualizar</a></td>
                            <td><a class="btn btn-outline-danger" href="Cproductos?menu=usuario&accion=eliminar&id=<%=regM.getId()%>">Eliminar</a></td>
                            
                        </tr>
                        
                        <% 
                            }
                        %>
                        
                    </table>
                </div>
            </div>
        </div> --%>
        
    </body>
</html>
