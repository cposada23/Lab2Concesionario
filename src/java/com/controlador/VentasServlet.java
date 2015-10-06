/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.VentaDAOLocal;
import com.modelo.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ElMarto
 */
public class VentasServlet extends HttpServlet {
    

    
    @EJB
    private VentaDAOLocal ventaDAO;

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
        String action = request.getParameter("action");
        Venta venta=null;
        
        System.out.println("Entro al servlet");
        int codigo;
        String codigoAux;
        String fecha;
        String matricula;
        int vehiculo;
        int cliente;
        int vendedor;
        
        codigoAux = request.getParameter("codigo");
        
        System.out.println(action);
        System.out.println(codigoAux);
          //Realizo las acciones del boton segun el evento capturado
        if("Add".equalsIgnoreCase(action)){
            //Capturamos los datos desde el formulario
            codigoAux = request.getParameter("codigo");
            codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo= Integer.parseInt(codigoAux);
            }
            fecha = request.getParameter("fecha");
            matricula = request.getParameter("matricula");
            vehiculo = Integer.parseInt(request.getParameter("vehiculo"));
            cliente = Integer.parseInt(request.getParameter("cliente"));
            vendedor = Integer.parseInt(request.getParameter("vendedor"));
            //llamo el contructor con parametros
            //Venta(int codigo, String fecha, String matricula, int vehiculo, int cliente, int vendedor) 
            venta = new Venta(codigo,  fecha,  matricula,  vehiculo,cliente, vendedor);
            
            ventaDAO.addVenta(venta);
        } 
        else if("Search".equalsIgnoreCase(action)){
            codigoAux = request.getParameter("codigo");
            codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo= Integer.parseInt(codigoAux);
            }
            venta = ventaDAO.getVenta(codigo);
        }
        
        
           //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("venta", venta);//si es solo 1 objeto
        request.setAttribute("allventas", ventaDAO.listarVentas());
        request.getRequestDispatcher("ventas.jsp").forward(request, response);
        
      
    
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
