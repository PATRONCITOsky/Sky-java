<%-- 
    Document   : usuario
    Created on : 22/11/2021, 03:58:00 PM
    Author     : SENA
--%>

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
                    <%--
                    <h1>Lista de Usuarios</h1>
                    <table class="table table-bordered">
                        <tr>
                            
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Contacto</th>
                            <th>Correo</th>
                            <th>Role</th>
                            <th></th>
                            <th></th>
                        </tr>
                        <% 
                            List lis = new registroDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while(list.hasNext()){
                                registroBeens regM = (registroBeens)list.next();
                            
                        %> 
                        
                        <tr>
                            
                            <td><%= regM.getId() %></td>
                            <td><%= regM.getNombres() %></td>
                            <td><%= regM.getContacto() %></td>
                            <td><%= regM.getCorreo() %></td>
                            <td><%= regM.getRole() %></td>
                            <td> <button>Actualizar</button> </td>
                            <td> <button>Eliminar</button> </td>
                        </tr>
                        
                        <% 
                            }
                        %>
                        
                    </table>
                    --%>
                </div>
            </div>
        </div>
        
    </body>
</html>
