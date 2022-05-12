<%-- 
    Document   : contactos
    Created on : 22/11/2021, 04:50:58 PM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="css/global.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/cabecera.jsp"%>  


        <div class="container">
            
            <h1 class="text-center">Contáctanos</h1>
                <form method="POST" action="">
                  <div class="row justify-content-center">  
                    
                        <div class="col-sm-3">
                            <label class="font-weight-bold">Nombre</label>
                            <input class="form-control" type="text" placeholder="Ingrese nombre" name="nombres">
                        </div>
                        <div class="col-sm-3">
                            <label class="font-weight-bold">Correo Electrónico</label>
                            <input  class="form-control" type="email" placeholder="Ingrese el correo" name="correo" required="">
                        </div>
                    </div> 
                    <div class="row justify-content-center">
                            <div class="col-sm-6">
                                <label class="font-weight-bold">Número Celular</label>
                                <input class="form-control" type="tel"  placeholder="Ingrese número celular" name="celular" pattern="\([0-9]{3}\) [0-9]{3}[ -][0-9]{4}" title="Un número de teléfono válido consiste en un área de código de 3 dígitos entre corchetes, un espacio, los tres primeros dígitos del número, un espacio o guión (-), y cuatro dígitos más" required>
                            </div>
                    </div>


                    <div class="row justify-content-center">
                            <div class="col-sm-6">
                                <label class="font-weight-bold">Mensaje</label>
                                <textarea  class="form-control"  placeholder="Ingrese mensaje" name="mensaje" required=""> </textarea>
                            </div>
                    </div>

                            <br>
                            <div class="row justify-content-center">
                                <button type="submit" name="accion" value="insertar" class="btn btn-success">Enviar</button>&nbsp
                            </div>
                            </form>
                        
                    
            </div>


</body>
</html>
