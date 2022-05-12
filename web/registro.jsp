<%-- 
   Document   : registro
   Created on : 18/11/2021, 03:11:10 PM
   Author     : SENA-WS-H50-1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="css/global.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/cabecera.jsp"%>
        <div class="container registro">
            <h1 class="font-weight-bold">Formulario de registro</h1>
            <form method="POST" action="RegistroControl?accion=insertar">
                <div class="row justify-content-center">
                    <div class="col-sm-4">
                        <label class="font-weight-bold">Nombre</label>
                        <input class="form-control" type="text" placeholder="Ingrese nombre" name="nombres">
                    </div>
                    <div class="col-sm-4">
                        <label class="font-weight-bold">Contacto</label>
                        <input  class="form-control" type="text" placeholder="Ingrese el contacto" name="contacto">
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm-4">
                        <label class="font-weight-bold">Correo</label>
                        <input class="form-control" type="text" placeholder="Ingrese Correo" name="correo">
                    </div>
                    <div class="col-sm-4">
                        <label class="font-weight-bold">Password</label>
                        <input  class="form-control" type="password" placeholder="Ingrese contraseña" name="password">
                    </div>
                </div>
                <br>
                <div class="row justify-content-center">
                    <button type="submit" name="accion" value="insertar" class="btn btn-success">Enviar</button>&nbsp
                    <a href="logueo.jsp" class="btn btn-outline-dark">  Login</a>
                </div>
            </form>
        </div>

    </body>
</html>
