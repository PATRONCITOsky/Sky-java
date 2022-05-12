<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="commons/cdn.jsp" %>
        <link rel="stylesheet" href="css/global.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/cabecera.jsp"%>
        <div class="container mt-4 col-lg-3">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sing" action="validarIngreso" method="POST">
                        <div class="form-group text-center" >
                            <h3 class="font-weight-bold">LOGIN</h3>
                            <img src="img/dl.jpg" alt="70" width="170">
                            
                        </div>
                        <div class="form-group text-center">
                            <label>Ingreso al sistema</label>
                        </div>
                        <div class="form-group">
                            <label class="font-weight-bold">Usuario</label>
                            <input type="text" name="txtUser" class="form-control">
                        </div>
                        
                        <div class="form-group">
                            <label class="font-weight-bold">Contraseña</label>
                            <input type="password" name="txtPass" class="form-control">
                        </div>
                        <input type="submit" name="accion"  value="ingresar" class="btn btn-primary btn-block">
                        <input type="submit" name="accion"  value="regresar" class="btn btn-dark btn-block">
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>