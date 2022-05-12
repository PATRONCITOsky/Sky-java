/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Fecha;
import DAO.registroDAOCompra;
import DAO.registroDAOProductos;
import beens.registroBeens;
import beens.registroBeensCarrito;
import beens.registroBeensCompras;
import beens.registroBeensP;
import beens.registroBeensPago;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SENA
 */
public class Ccar extends HttpServlet {

    //Se instancia la clase registroDAOProductos
    registroDAOProductos miRDAO = new registroDAOProductos();
    //Se instancia la clase registroBeensP
    registroBeensP miRBeens = new registroBeensP();
    //Se crea una lista
    List<registroBeensP> listica = new ArrayList<>();

    int idUsr;

    List<registroBeensCarrito> listacar = new ArrayList<>();
    int item;
    double totalPagar = 0.0;
    int cantidadP = 1;

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
        
        /*Se inplementan las acciones
        tanto op como opc reciben la accion que realiza el usuario
        */
        String op = request.getParameter("menu");
        String opc = request.getParameter("accion");
        // la variable listica almacena todos los productos de la bd
        listica = miRDAO.listar();

        if (op.equals("Ppal")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if (op.equals("usuario")) {
            switch (opc) {
                case "mostrar":
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;

                case "productos":
                    request.setAttribute("registroBeensP", listica);
                    request.getRequestDispatcher("carrito.jsp").forward(request, response);
                    break;

                case "compra":
                    totalPagar = 0.0;
                    idUsr = Integer.parseInt(request.getParameter("id"));
                    miRBeens = miRDAO.listarId(idUsr);
                    item = item + 1;
                    registroBeensCarrito carro1 = new registroBeensCarrito();
                    carro1.setItem(item);
                    carro1.setId(miRBeens.getId());
                    carro1.setNombres(miRBeens.getNombres());
                    carro1.setDescripcion(miRBeens.getDescripcion());
                    carro1.setCosto(miRBeens.getCosto());
                    carro1.setCantidadP(cantidadP);
                    carro1.setSubtotal(cantidadP * miRBeens.getCosto());
                    listacar.add(carro1);

                    for (int i = 0; i < listacar.size(); i++) {
                        totalPagar = totalPagar + listacar.get(i).getSubtotal();
                    }

                    request.setAttribute("totalcompra", totalPagar);
                    request.setAttribute("registroBeensCarrito", listacar);
                    request.setAttribute("con", listacar.size());
                    request.getRequestDispatcher("carrito2.jsp").forward(request, response);
                    break;

                case "carrito":

                    totalPagar = 0.0;
                    request.setAttribute("registroBeensCarrito", listacar);
                    for (int i = 0; i < listacar.size(); i++) {
                        totalPagar = totalPagar + listacar.get(i).getSubtotal();
                    }
                    request.setAttribute("totalcompra", totalPagar);
                    request.getRequestDispatcher("carrito2.jsp").forward(request, response);

                    break;

                case "agregarc":
                    //se declara una variable para conocer la posición del producto
                    int posc = 0;
                    cantidadP = 1;

                    idUsr = Integer.parseInt(request.getParameter("id"));
                    miRBeens = miRDAO.listarId(idUsr);

                    if (listacar.size() > 0) {
                        for (int i = 0; i < listacar.size(); i++) {
                            if (idUsr == listacar.get(i).getId()) {
                                posc = i;
                            }
                        }
                        if (idUsr == listacar.get(posc).getId()) {
                            cantidadP = listacar.get(posc).getCantidadP() + cantidadP;
                            float subtotal = listacar.get(posc).getCosto()*cantidadP;
                            listacar.get(posc).setCantidadP(cantidadP);
                            listacar.get(posc).setSubtotal(subtotal);
                        } else {
                            item = item + 1;
                            registroBeensCarrito carro = new registroBeensCarrito();
                            carro.setItem(item);
                            carro.setId(miRBeens.getId());
                            carro.setNombres(miRBeens.getNombres());
                            carro.setDescripcion(miRBeens.getDescripcion());
                            carro.setCosto(miRBeens.getCosto());
                            carro.setCantidadP(cantidadP);
                            carro.setSubtotal(cantidadP * miRBeens.getCosto());
                            listacar.add(carro);
                        }
                    } else {
                        item = item + 1;
                        registroBeensCarrito carro = new registroBeensCarrito();
                        carro.setItem(item);
                        carro.setId(miRBeens.getId());
                        carro.setNombres(miRBeens.getNombres());
                        carro.setDescripcion(miRBeens.getDescripcion());
                        carro.setCosto(miRBeens.getCosto());
                        carro.setCantidadP(cantidadP);
                        carro.setSubtotal(cantidadP * miRBeens.getCosto());
                        listacar.add(carro);
                    }

                    request.setAttribute("con", listacar.size());
                    
                    //request.setAttribute("registroBeensP", listica);
                    request.getRequestDispatcher("Ccar?menu=usuario&accion=productos").forward(request, response);
                    
                    break;

                case "Delete":
                    int idProducto = Integer.parseInt(request.getParameter("idp"));
                    for (int i = 0; i < listacar.size(); i++) {
                        if (listacar.get(i).getId() == idProducto) {
                            listacar.remove(i);
                        }
                    }
                    break;
                    
                case "EditCan":
                    int idpr = Integer.parseInt(request.getParameter("idp"));
                    int can = Integer.parseInt(request.getParameter("can"));
                    for (int i = 0; i < listacar.size(); i++) {
                        if (listacar.get(i).getId() == idpr) {
                            listacar.get(i).setCantidadP(can);
                            float subt = listacar.get(i).getCosto()*can;
                            listacar.get(i).setSubtotal(subt);
                        }
                    }
                    
                    break;
                    
                case "descrip":
                    int idB;
                    idB = Integer.parseInt(request.getParameter("id"));
                    miRBeens = miRDAO.listarId(idB);
                    break;
                    
                case "GenerarC":
                    registroBeens Usuario = new registroBeens();
                    Usuario.setId(1);
                    registroDAOCompra CompraDAO = new registroDAOCompra();
                    registroBeensCompras Compras= new registroBeensCompras(Usuario, 1, Fecha.FechaBD(), totalPagar, "Cancelado", listacar);
                    int respuesta = CompraDAO.GenerarCompra(Compras);
                    
                    if (respuesta != 0 && totalPagar > 0) {
                        request.getRequestDispatcher("CompraExitosa.jsp").forward(request, response);
                    }else{
                        request.getRequestDispatcher("CompraFallida.jsp").forward(request, response);
                    }
                    
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
