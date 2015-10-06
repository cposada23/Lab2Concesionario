/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.ModeloVehiculoDAOLocal;
import com.modelo.ModeloVehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author camilo.posadaa
 */
public class ModeloVehiculoServlet extends HttpServlet {
    @EJB
    private ModeloVehiculoDAOLocal modeloVehiculoDAO;
    
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
        ModeloVehiculo modeloVehiculo = null;
        ModeloVehiculo modeloVehiculo2= null;
        int codigo;
        String nombre;
        String tipo;
        String codigoStr;
        String mensaje=null;
        String page =null;
        
        //Action sirve para tomar el evento del boton
        String action = request.getParameter("action");
        
        //Realizo las acciones del boton segun el evento capturado
        if("Add".equalsIgnoreCase(action) || "Edit".equalsIgnoreCase(action) ){
            //Capturamos los datos desde el formulario
            codigoStr = request.getParameter("codigo");
            codigo = 0;
            if (codigoStr != null && !codigoStr.equals("")) {
                codigo= Integer.parseInt(codigoStr);
            }

            nombre = request.getParameter("nombre");
            tipo = request.getParameter("tipo");
            
            modeloVehiculo2 = modeloVehiculoDAO.getModelo(codigo);

           
            modeloVehiculo = new ModeloVehiculo(codigo, nombre, tipo);
            if("Add".equalsIgnoreCase(action)){
                if (modeloVehiculo2!=null){
                    mensaje ="El modelo ya existe";
                    request.setAttribute("mensaje", mensaje);
                    
                }else{
                    mensaje = "Modelo insertado correctamente";
                    modeloVehiculoDAO.addModelo(modeloVehiculo);
                    request.setAttribute("mensaje", mensaje);
                }
                page = "mensaje.jsp";
                
            }
            else if ("Edit".equalsIgnoreCase(action)){
                modeloVehiculoDAO.editModelo(modeloVehiculo);
            }
        }else if("Delete".equalsIgnoreCase(action)){
           codigoStr = request.getParameter("codigo");
           codigo = 0;
            if (codigoStr != null && !codigoStr.equals("")) {
                codigo= Integer.parseInt(codigoStr);
            }
           modeloVehiculoDAO.deleteModeloVehiculo(codigo);
        }else if("Search".equalsIgnoreCase(action)){
            codigoStr = request.getParameter("codigo");
            codigo = 0;
            if (codigoStr != null && !codigoStr.equals("")) {
                codigo= Integer.parseInt(codigoStr);
            }
            modeloVehiculo = modeloVehiculoDAO.getModelo(codigo);
        }else if("Listar".equalsIgnoreCase(action)){
            request.setAttribute("allModelos", modeloVehiculoDAO.getAllModelos());
            page = "listarModelos.jsp";
        }
        //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("modeloVehiculo", modeloVehiculo);//si es solo 1 objeto
        
        request.getRequestDispatcher(page).forward(request, response);
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
