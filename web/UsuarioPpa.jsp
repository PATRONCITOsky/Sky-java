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
                    <form action="ControladorU?menu=usuario" method="POST">

                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <label>Nombre</label>
                                <input type="text" value="${usuario.getNombres()}" name="txtNombres" class="form-control" required>
                            </div>
                            <div class="col-sm-3">
                                <label>Contacto</label>
                                <input type="text" value="${usuario.getContacto()}" name="txtContacto" class="form-control" required>
                            </div>
                            <div class="col-sm-3">
                                <label>Correo</label>
                                <input type="email" value="${usuario.getCorreo()}" name="txtCorreo" class="form-control" required>
                            </div>
                            
                             
                        </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-5">
                                <label>Password</label>
                                <input type="text" value="${usuario.getPassword()}" name="txtClave" class="form-control" required>
                            </div>
                            </div>

                        <button type="submit" name="accion" value="insertar" class="btn btn-outline-success">
                            <i class="fas fa-user-plus"></i> Guardar
                        </button>

                        <button type="submit" name="accion" value="modifica" class="btn btn-outline-warning">
                            <i class="fas fa-edit"></i> Modificar
                        </button>
                    </form>

                    <h1>Lista de Usuarios</h1>
                    <input class="form-control" id="myInput" type="text" placeholder="Busqueda de usuario">
                    <br>
                    <table class="table table-dark table-hover" id="myTable">
                        <tr>

                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Contacto</th>
                            <th>Correo</th>
                            <th>Role</th>
                            <th>Actualizar</th>
                            <th>Eliminar</th>
                        </tr>
                        <%
                            List lis = new registroDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                registroBeens regM = (registroBeens) list.next();

                        %> 

                        <tr>

                            <td><%= regM.getId()%></td>
                            <td><%= regM.getNombres()%></td>
                            <td><%= regM.getContacto()%></td>
                            <td><%= regM.getCorreo()%></td>
                            <td><%= regM.getRole()%></td>
                            <td><a class="btn btn-outline-success" href="ControladorU?menu=usuario&accion=actualizar&id=<%=regM.getId()%>">Actualizar</a></td>
                            <td><a class="btn btn-outline-danger" href="ControladorU?menu=usuario&accion=eliminar&id=<%=regM.getId()%>">Eliminar</a></td>

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
