/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Emanuel
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        //   processRequest(request, response);
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
        //   processRequest(request, response);
        response.setContentType("text/html");
        
        String nuevoArticulo = request.getParameter("articulo");
        //creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();

        //Luego, recuperamos lalista de articulos previoss si no entonces nuevos van
        //el metodo getAttribute es como un Map entonces el key es lo que esta en la cadena 
        // y el valor son todos los articulo que quedaran en la collection articulos.
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        sesion.setMaxInactiveInterval(8);
        //verificamos si esta lista ya exite\
        if (articulos == null) {
            //la inicializamos
            //y la agregamos a la sesion por set
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        //si no esta vacio
        if (nuevoArticulo != null && !nuevoArticulo.trim().equals("")) {
            //como no esta vacio entonces lo agregamos a la lista.
            articulos.add(nuevoArticulo);
        }
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CarritoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de Articulos</h1>");
            out.println("<br>");
            //iteramos todos los articulos para mostrarlos
            for (String articulo : articulos) {
                out.println("<li>" + articulo + "</li>");
            }
            out.println("<br>");
            out.println("<a href='/CarritoCompras/main.html'>Volver hacia Atr&aacutes</a>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }
}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
