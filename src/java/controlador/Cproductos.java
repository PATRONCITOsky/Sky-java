/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import DAO.registroDAOProductos;
import beens.registroBeensP;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Hoover
 */

@MultipartConfig
public class Cproductos extends HttpServlet {
    
    registroDAOProductos miRDAO = new registroDAOProductos();
    
    registroBeensP miRBeens = new registroBeensP();
    int idUsr;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("menu");
        String opc = request.getParameter("accion");
        
        
        
        if (op.equals("Ppal")) {
            request.getRequestDispatcher("productos.jsp").forward(request, response);
        }
        if (op.equals("usuario")) {
            switch (opc){
                case "mostrar":
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                    
                case "insertar":
                    String nom = request.getParameter("txtNombres");
                    float cos = Integer.parseInt(request.getParameter("txtCosto"));
                    String desc = request.getParameter("txtDescripcion");
                    int can = Integer.parseInt(request.getParameter("txtCantidad"));
                    int id = Integer.parseInt(request.getParameter("produ_catego_id"));
                    Part part = request.getPart("txtImagen");
                    InputStream inputStream = part.getInputStream();
                    
                    
                    miRBeens.setNombres(nom);
                    miRBeens.setCosto(cos);
                    miRBeens.setDescripcion(desc);
                    miRBeens.setCantidad(can);
                    miRBeens.setId_categoria(id);
                    miRBeens.setImagen(inputStream);
            
                    
                    miRDAO.insertar(miRBeens);
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                    
                case "eliminar":
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    //se llama el metodo eliminar de RegistroDAO
                    miRDAO.eliminar(idUsr);
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "actualizar":
                    //se recibe como parametro la variable id al oprimir el botón
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    registroBeensP miBeans = miRDAO.cargar(idUsr);
                    //se envia los avalores cargados del metodo cargar, al formulario
                    request.setAttribute("usuario", miBeans);
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "modifica":
                    String nom2 = request.getParameter("txtNombres");
                    float cos2 = Integer.parseInt(request.getParameter("txtCosto"));
                    String desc2 = request.getParameter("txtDescripcion");
                    int can2 = Integer.parseInt(request.getParameter("txtCantidad"));
                    int idc = Integer.parseInt(request.getParameter("produ_catego_id"));
                    
                    Part part3 = request.getPart("txtImagen");
                    InputStream inputStream3 = part3.getInputStream();
                    
                    
                    miRBeens.setNombres(nom2);
                    miRBeens.setCosto(cos2);
                    miRBeens.setDescripcion(desc2);
                    miRBeens.setCantidad(can2);
                    miRBeens.setId_categoria(idc);
                    miRBeens.setImagen(inputStream3);
                    miRBeens.setId(idUsr);
                    miRDAO.modificar(miRBeens);
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                
                default:
                    throw new AssertionError();
                    //request.getRequestDispatcher("UsuarioPpa.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
