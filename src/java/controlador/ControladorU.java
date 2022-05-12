/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.registroDAO;
import beens.registroBeens;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SENA
 */
public class ControladorU extends HttpServlet {
    
    registroDAO miRDAO = new registroDAO();
    registroBeens miRBeens = new registroBeens();
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
            request.getRequestDispatcher("usuario.jsp").forward(request, response);
        }
        if (op.equals("usuario")) {
            switch (opc){
                case "mostrar":
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;
                    
                case "insertar":
                    String nom = request.getParameter("txtNombres");
                    String cont = request.getParameter("txtContacto");
                    String email = request.getParameter("txtCorreo");
                    String pass = request.getParameter("txtClave");
                    
                    miRBeens.setNombres(nom);
                    miRBeens.setContacto(cont);
                    miRBeens.setCorreo(email);
                    miRBeens.setPassword(pass);
            
                    
                    miRDAO.insertar(miRBeens);
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;
                    
                case "eliminar":
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    //se llama el metodo eliminar de RegistroDAO
                    miRDAO.eliminar(idUsr);
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;
                case "actualizar":
                    //se recibe como parametro la variable id al oprimir el botón
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    registroBeens miBeans = miRDAO.cargar(idUsr);
                    //se envia los avalores cargados del metodo cargar, al formulario
                    request.setAttribute("usuario", miBeans);
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;
                /*case "actualiza":
                    //se recibe como parametro la variable id al oprimir el botón
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    registroBeens miBeans = miRDAO.cargar(idUsr);
                    //se envia los avalores cargados del metodo cargar, al formulario
                    request.setAttribute("usuario", miBeans);
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;*/
                case "modifica":
                    String nom2 = request.getParameter("txtNombres");
                    String cont2 = request.getParameter("txtContacto");
                    String email2 = request.getParameter("txtCorreo");
                    String pass2 = request.getParameter("txtClave");
                    
                    miRBeens.setNombres(nom2);
                    miRBeens.setContacto(cont2);
                    miRBeens.setCorreo(email2);
                    miRBeens.setPassword(pass2);
                    
                    
                    miRBeens.setId(idUsr);
                    miRDAO.modificar(miRBeens);
                    
                    /*miRDAO.validar(email2, pass2);
                    request.setAttribute("usr", miRBeens);*/
                    
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;
                /*case "modificar":
                    String nom2 = request.getParameter("txtNombres");
                    String cont2 = request.getParameter("txtContacto");
                    String email2 = request.getParameter("txtCorreo");
                    String pass2 = request.getParameter("txtClave");
                    
                    miRBeens.setNombres(nom2);
                    miRBeens.setContacto(cont2);
                    miRBeens.setCorreo(email2);
                    miRBeens.setPassword(pass2);
                    
                    miRBeens.setId(idUsr);
                    miRDAO.modificar(miRBeens);
                    request.getRequestDispatcher("UsuarioPpa.jsp").forward(request, response);
                    break;*/
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
