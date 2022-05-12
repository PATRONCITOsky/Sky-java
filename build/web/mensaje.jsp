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
                    <%@include file="commons/sideBar3.jsp" %>
                </div>
                
                <div class="col-sm-9 main-col">
                    
                    <h3>La actualización fué exitosa por favor ingrese nuevamente</h3>
                        
                </div>
            </div>
        </div>
        
    </body>
</html>
