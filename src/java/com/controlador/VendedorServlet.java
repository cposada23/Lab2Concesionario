/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.VendedorDAOLocal;
import com.modelo.Cliente;
import com.modelo.Vendedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cposa
 */
public class VendedorServlet extends HttpServlet {
    @EJB
    private VendedorDAOLocal vendedorDAO;
    
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
        response.setContentType("text/html;charset=UTF-8");
        //Action sirve para tomar el evento del boton
        String action = request.getParameter("action");
        Vendedor vendedor = null;
        String documetoVendedorStr;
        String nombre;
        String apellido;
        String email;
        String telefono;
        //Realizo las acciones del boton segun el evento capturado
        if("Add".equalsIgnoreCase(action) || "Edit".equalsIgnoreCase(action) ){
            //Capturamos los datos desde el formulario
            documetoVendedorStr = request.getParameter("documento");
            int documento = 0;
            if (documetoVendedorStr != null && !documetoVendedorStr.equals("")) {
                documento= Integer.parseInt(documetoVendedorStr);
            }

            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            email = request.getParameter("email");
            telefono = request.getParameter("telefono");


            //llamo el contructor con parametros
            vendedor = new Vendedor(documento, nombre, apellido, email, telefono);
            if("Add".equalsIgnoreCase(action)){
                vendedorDAO.addVendedor(vendedor);
            }
            else if ("Edit".equalsIgnoreCase(action)){
                vendedorDAO.editVendedor(vendedor);
            }
        }else if("Delete".equalsIgnoreCase(action)){
           documetoVendedorStr = request.getParameter("documento");
           int documento = 0;
            if (documetoVendedorStr != null && !documetoVendedorStr.equals("")) {
                documento= Integer.parseInt(documetoVendedorStr);
            }
           vendedorDAO.deleteVendedor(documento);
        }else if("Search".equalsIgnoreCase(action)){
            documetoVendedorStr = request.getParameter("documento");
            int documento = 0;
            if (documetoVendedorStr != null && !documetoVendedorStr.equals("")) {
                documento= Integer.parseInt(documetoVendedorStr);
            }
            vendedor = vendedorDAO.getVendedor(documento);
        }
        
           
        //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("vendedor", vendedor);//si es solo 1 objeto
        request.setAttribute("allVendedores", vendedorDAO.getAllVendedores());
        request.getRequestDispatcher("pages/vendedor/vendedor.jsp").forward(request, response);
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
