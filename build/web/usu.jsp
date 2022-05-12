<%-- 
    Document   : usuario
    Created on : 22/11/2021, 03:58:00 PM
    Author     : SENA
--%>

<%@page import="beens.registroBeensUSU"%>
<%@page import="DAO.registroDAOUSU"%>
<%@page import="java.util.ListIterator"%>
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
                    <form action="Cusu?menu=usuario" method="POST">
                        
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <label>Nombre</label>
                                <input type="text" value="${usu.getNombres()}" name="txtNombres" class="form-control" required>
                            </div>
                            <div class="col-sm-3">
                                <label>Contacto</label>
                                <input type="text" value="${usu.getContacto()}" name="txtContacto" class="form-control" required>
                            </div>
                            <div class="col-sm-3">
                                <label>Correo</label>
                                <input type="text" value="${usu.getCorreo()}" name="txtCorreo" class="form-control" required>
                            </div>
                              
                        </div>
                        
                            <div class="form-group d-flex">
                                <div class="col-sm-5">
                                <label>Password</label>
                                <input type="text" value="${usu.getPassword()}" name="txtClave" class="form-control" required>
                                </div>
                            </div>
                        
                                
                                <button type="submit" name="accion" value="modificar" class="btn btn-outline-warning">
                                    <i class="fas fa-edit"></i> Modificar
                                </button>
                    </form>
               
                    <h1>Usuario </h1>
                    <table class="table table-dark table-hover">
                        <tr>
                            
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Contacto</th>
                            <th>Correo</th>
                            <th>Role</th>
                            <th>Actualizar</th>
                            
                        </tr>
                        <% 
                            List lis = new registroDAOUSU().getAll();
                            ListIterator list = lis.listIterator();
                            
                                registroBeensUSU regM = (registroBeensUSU)list.next();
                            
                        %> 
                        
                        <tr>
                            
                            <td>${usuario.getId()}</td>
                            <td>${usuario.getNombres()}</td>
                            <td>${usuario.getContacto()}</td>
                            <td>${usuario.getCorreo()}</td>
                            <td>${usuario.getRole()}</td>

                           <%-- <td><%= regM.getId() %></td>
                            <td><%= regM.getNombres() %></td>
                            <td><%= regM.getContacto() %></td>
                            <td><%= regM.getCorreo() %></td>
                            <td><%= regM.getRole() %></td>--%> 
                            <td><a class="btn btn-outline-success" href="Cusu?menu=usuario&accion=actualiza&id=${usuario.getId()}">Actualizar</a></td>
                            
                            
                        </tr>
                        
                        <% 
                            
                        %>
                        
                    </table>
                </div>
            </div>
        </div>
        
    </body>
</html>
