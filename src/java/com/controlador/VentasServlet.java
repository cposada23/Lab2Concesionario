/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.ClienteDAO;
import com.dao.ClienteDAOLocal;
import com.dao.VehiculoDaoLocal;
import com.dao.VendedorDAOLocal;
import com.dao.VentaDAOLocal;
import com.modelo.Cliente;
import com.modelo.Vehiculo;
import com.modelo.Vendedor;
import com.modelo.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
    @EJB
    private VehiculoDaoLocal vehiculoDAO;
    @EJB
    private VendedorDAOLocal vendedorDAO;
    @EJB
    private ClienteDAOLocal clienteDAO;

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

        System.out.println("Entro Al Servlet De Ventas");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        Venta venta = null;

        System.out.println("Entro al servlet");
        int codigo;
        String codigoAux;
        String fecha;
        String matricula;
        int vehiculo;
        int cliente;
        int vendedor;
        String mensaje = "";
        String page = null;

        

        System.out.println(action);
        
        //Realizo las acciones del boton segun el evento capturado

        if ("Add".equalsIgnoreCase(action)) {
            codigoAux = request.getParameter("codigo");
            System.out.println(codigoAux);
             mensaje = "";
            System.out.println("Voy a Añadir");

            //Capturamos los datos desde el formulario
            
            codigo = 0;
            if (codigoAux != null && !codigoAux.equals("")) {
                codigo = Integer.parseInt(codigoAux);
            }
            fecha = request.getParameter("fecha");
            matricula = request.getParameter("matricula");
            vehiculo = Integer.parseInt(request.getParameter("vehiculo"));
            cliente = Integer.parseInt(request.getParameter("cliente"));
            vendedor = Integer.parseInt(request.getParameter("vendedor"));
            //llamo el contructor con parametros
            //Venta(int codigo, String fecha, String matricula, int vehiculo, int cliente, int vendedor) 

            //Validamos que las claves foraneas existan.
            Vehiculo vehiculoAux = vehiculoDAO.getVehiculo(vehiculo);
            Vendedor vendedorAux = vendedorDAO.getVendedor(vendedor);
            Cliente clienteAux = clienteDAO.getCliente(cliente);

            Venta venta2 = ventaDAO.getVenta(codigo);
            List<Venta> vent = ventaDAO.getVentaxMatricula(matricula);
           // System.out.println("--->" + vent.get(0).getMatricula());
            if (venta2 == null && vent.isEmpty()) {

                if (clienteAux != null && vendedorAux != null && vehiculoAux != null) {
                    //Agregamos la venta

                    venta = new Venta(codigo, fecha, matricula, vehiculo, cliente, vendedor);
                    ventaDAO.addVenta(venta);
                    page ="mensaje.jsp";
                     //request.getRequestDispatcher("mensaje.jsp").forward(request, response);
                    mensaje = "Se ha añadido su venta exitosamente";
                } else {
                    if (clienteAux == null) {
                        mensaje = "|El cliente no existe en la base datos|";
                    }
                    if (vendedorAux == null) {
                        mensaje = mensaje + "| El vendedor no existe en la base de datos |";
                    }
                    if (vehiculoAux == null) {
                        mensaje = mensaje + "| El vehiculo no existe en la base de datos |";
                    }

                }

            } else {
                if (venta2 != null) {
                    mensaje = "El codigo de la venta ya se encuentra en la base de datos";
                    venta = venta2;
                }
                if (vent.get(0) != null) {
                    mensaje = "La matricula ya pertenece a otra venta :" + vent.get(0).getMatricula();
                }

            }
            
            page ="./mensaje.jsp";

        } else if ("Search".equalsIgnoreCase(action)) {
            mensaje = "";
            matricula = request.getParameter("matricula");
            System.out.println(matricula);
           
           List vent = ventaDAO.getVentaxMatricula(matricula);
            //System.out.println(vent.size());
            if(vent!=null){
                 
                  venta= (Venta)vent.get(0);
                  request.setAttribute("venta", venta);
                  
            }else{
                mensaje="No existe";
                request.setAttribute("mensaje", mensaje);
            }
            page = "./buscarVenta.jsp";
            
        } else if ("Listar".equalsIgnoreCase(action)){
            System.out.println("entro a listar");
            List<Venta> vent = ventaDAO.listarVentas();
            request.setAttribute("a", vent);
            System.out.println(vent.size());
            mensaje = vent.get(0).getFecha();
            page="./listarVentas.jsp";
        }

        //Reenvio de objetos hacia la vista (index.jsp)
        request.setAttribute("mensaje", mensaje);
        //request.setAttribute("venta", venta);//si es solo 1 objeto
        
        //request.setAttribute("allvehiculo", vehiculoDAO.getAllVehiculos());
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
