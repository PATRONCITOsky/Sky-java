/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.registroDAOPC;
import beens.registroBeensPC;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author h2ver
 */
public class ControladorPC extends HttpServlet {
    
    registroDAOPC miRDAOPC = new registroDAOPC();
    registroBeensPC miRBeensPC = new registroBeensPC();
    int idPc;
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
            request.getRequestDispatcher("usuario.jsp").forward(request, response);
        }
        if (op.equals("usuario")) {
            switch (opc){
                case "mostrar":
                    request.getRequestDispatcher("ProductosCategoria.jsp").forward(request, response);
                    break;
                    
                case "insertar":
                    String nom = request.getParameter("txtNombres");
                    miRBeensPC.setNombre(nom);
            
                    miRDAOPC.insertar(miRBeensPC);
                    request.getRequestDispatcher("ProductosCategoria.jsp").forward(request, response);
                    break;
                    
                case "eliminar":
                    idPc = Integer.parseInt(request.getParameter("id"));
                    //se llama el metodo eliminar de RegistroDAO
                    miRDAOPC.eliminar(idPc);
                    request.getRequestDispatcher("ProductosCategoria.jsp").forward(request, response);
                    break;
                case "actualizar":
                    //se recibe como parametro la variable id al oprimir el botón
                    idPc = Integer.parseInt(request.getParameter("id"));
                    registroBeensPC miBeans = miRDAOPC.cargar(idPc);
                    //se envia los avalores cargados del metodo cargar, al formulario
                    request.setAttribute("usuario", miBeans);
                    request.getRequestDispatcher("ProductosCategoria.jsp").forward(request, response);
                    break;
                case "modifica":
                    String nom2 = request.getParameter("txtNombres");
                    
                    miRBeensPC.setNombre(nom2);
                    
                    miRBeensPC.setId(idPc);
                    miRDAOPC.modificar(miRBeensPC);
                    request.getRequestDispatcher("ProductosCategoria.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
                    
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
