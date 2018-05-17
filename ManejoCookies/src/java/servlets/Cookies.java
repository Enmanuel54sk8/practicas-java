/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emanuel
 */
@WebServlet(name = "Cookies", urlPatterns = {"/Cookies"})
public class Cookies extends HttpServlet {

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
       // processRequest(request, response);

       
       
        //suponemos que esta entrando por primera vez al sitio. bandera en true
        boolean nuevoUsuario = true;
        //obtenemos todas las cookies
        Cookie[] cookie = request.getCookies();
        //buscamos si ya exite una cookie creada
        if (cookie != null) {
            //como es un areglo uso un for each
            for (Cookie c : cookie) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //si ya existe ponemos la bandera en false
                    nuevoUsuario = false; //por que ya lo ha visitado el sitio
                    break;//rompemos
                }
            }
        }
        //a ver si es nuevo
        String mensaje = null;
        if (nuevoUsuario) {
            //Aqui es donde se ven esos valores que verificamos anteriormente
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            //agregamos a la respuesta
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitarnos por primera vez";
        } else {
            mensaje = "Buenas nuevamente";
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Mensaje: " + mensaje);
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
       // processRequest(request, response);
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
