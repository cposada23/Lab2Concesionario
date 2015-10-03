/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.VehiculoDaoLocal;
import com.modelo.Vehiculo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sun.misc.*;
/**
 *
 * @author Martin
 */
@WebServlet(name = "VehiculoServlet", urlPatterns = {"/VehiculoServlet"})
@MultipartConfig(maxFileSize=16177215)
public class VehiculoServlet extends HttpServlet {
    @EJB
    private VehiculoDaoLocal vehiculoDao;

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
        Vehiculo vehiculo=null;
        
        int codigo;
        String codigoAux;
        int precio;
        String precioAux;
        String ano;
        String modeloAux;
        
        int modelo;
        
      
        String action = request.getParameter("action");
        
   
      
          
          //Realizo las acciones del boton segun el evento capturado
        if("Add".equalsIgnoreCase(action) || "Edit".equalsIgnoreCase(action) ){
            //Capturamos los datos desde el formulario
            codigoAux = request.getParameter("codigo");
            codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo= Integer.parseInt(codigoAux);
            }
            modeloAux = request.getParameter("modelo");
            modelo = 0;
            if (modeloAux != null && !modeloAux.equals("")) {
                modelo= Integer.parseInt(modeloAux);
            }
            
            precioAux = request.getParameter("precio");
            precio = 0;
            if (precioAux != null && !modeloAux.equals("")) {
                precio= Integer.parseInt(precioAux);
            }

        
            
            ano = request.getParameter("ano");
            
             //Defino el input stream para el archivo que subire
        InputStream inputStream=null;
        
        //Obtengo la parte del archivo a cargar en la peticion (multipart)
        Part filePart=request.getPart("photo");
    
        //Obtengo el input stream del archivo cargado
        
        byte[] img= null;
        //valido que no este vacio el archivo
        if(filePart!=null){
            inputStream=filePart.getInputStream();
            //imprimo información para debbugin
            System.out.println(filePart.getName());//imprimo el nombre del archivo
            System.out.println(filePart.getSize());//imprimo el tamaño
            System.out.println(filePart.getContentType());//imprimo el MIME
            
 
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int nRead;
            byte[] targetArray = new byte[inputStream.available()];
            while ((nRead = inputStream.read(targetArray, 0, targetArray.length)) != -1) {
                buffer.write(targetArray, 0, nRead);
            }
 
            buffer.flush();
            img = buffer.toByteArray();

            
        }
       


            //llamo el contructor con parametros
            vehiculo = new Vehiculo(codigo,  precio,  ano,  modelo,img);
            if("Add".equalsIgnoreCase(action)){
                vehiculoDao.addVehiculo(vehiculo);
            }
            else if ("Edit".equalsIgnoreCase(action)){
                vehiculoDao.editVehiculo(vehiculo);
            }
        }else if("Delete".equalsIgnoreCase(action)){
           codigoAux = request.getParameter("codigo");
           codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo= Integer.parseInt(codigoAux);
            }
           vehiculoDao.deleteVehiculo(codigo);
        }else if("Search".equalsIgnoreCase(action)){
            codigoAux = request.getParameter("codigo");
            codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo= Integer.parseInt(codigoAux);
            }
            vehiculo = vehiculoDao.getVehiculo(codigo);
        }
        
        
           //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("vehiculo", vehiculo);//si es solo 1 objeto
        request.setAttribute("allVehiculo", vehiculoDao.getAllVehiculos());
        request.getRequestDispatcher("vehiculo.jsp").forward(request, response);
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
