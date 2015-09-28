/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.ClienteDAOLocal;
import com.modelo.Cliente;
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
public class ClienteServlet extends HttpServlet {
    
    @EJB
    private ClienteDAOLocal clienteDAO;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cliente cliente = null;
        String documetoClienteStr;
        String nombre;
        String apellido;
        String email;
        String telefono;
        response.setContentType("text/html;charset=UTF-8");
        
        //Action sirve para tomar el evento del boton
        String action = request.getParameter("action");
        
        //Realizo las acciones del boton segun el evento capturado
        if("Add".equalsIgnoreCase(action) || "Edit".equalsIgnoreCase(action) ){
            //Capturamos los datos desde el formulario
            documetoClienteStr = request.getParameter("documento");
            int documento = 0;
            if (documetoClienteStr != null && !documetoClienteStr.equals("")) {
                documento= Integer.parseInt(documetoClienteStr);
            }

            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            email = request.getParameter("email");
            telefono = request.getParameter("telefono");


            //llamo el contructor con parametros
            cliente = new Cliente(documento, nombre, apellido, email, telefono);
            if("Add".equalsIgnoreCase(action)){
                clienteDAO.addCliente(cliente);
            }
            else if ("Edit".equalsIgnoreCase(action)){
                clienteDAO.editCliente(cliente);
            }
        }else if("Delete".equalsIgnoreCase(action)){
           documetoClienteStr = request.getParameter("documento");
           int documento = 0;
            if (documetoClienteStr != null && !documetoClienteStr.equals("")) {
                documento= Integer.parseInt(documetoClienteStr);
            }
           clienteDAO.deleteCliente(documento);
        }else if("Search".equalsIgnoreCase(action)){
            documetoClienteStr = request.getParameter("documento");
            int documento = 0;
            if (documetoClienteStr != null && !documetoClienteStr.equals("")) {
                documento= Integer.parseInt(documetoClienteStr);
            }
            cliente = clienteDAO.getCliente(documento);
        }
        //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("cliente", cliente);//si es solo 1 objeto
        request.setAttribute("allClientes", clienteDAO.getAllClientes());
        request.getRequestDispatcher("cliente.jsp").forward(request, response);
        
        
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
