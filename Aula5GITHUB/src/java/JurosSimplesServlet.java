/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author easypc
 */
@WebServlet(name = "JuroSimplesServlet", urlPatterns = {"/juros-simples.htm"})
public class JurosSimplesServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>JurosSimplesServlet</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"#19C97D\">");
            out.println("<h1>Wesley Munhoz Brandão - RA:</h1>");
            
            out.println("<table border=1 bgcolor='#8CE4BE' align=center>");
            
            Double valor_presente = Double.parseDouble(request.getParameter("valor_presente"));
            
            out.println("<tr><td align=center>");
            out.println("<h1>Valor Presente:R$" + valor_presente + "</h1>");
            
            Double juros = Double.parseDouble(request.getParameter("juros"));
            
            out.println("<tr><td align=center>");
            out.println("<h1>Juros:" + juros + "%</h1>");
            out.println("</td></tr>");
            int tempo = Integer.parseInt(request.getParameter("tempo"));
            out.println("<tr><td align=center>");
            out.println("<h1>Tempo:" + tempo + "</h1>");
            out.println("</td></tr>");
            Double VF = valor_presente*(1 + juros * tempo);
            out.println("<tr><td align=center>");
            out.println("<h1>Valor Futuro = " + valor_presente + "(1 + " + juros + " * " + tempo + ")</h1>");
            out.println("</td></tr>");
            out.println("<tr><td align=center>");
            out.println("<h1>Valor Futuro:R$" + VF + "</h1>");
            out.println("</td></tr>");
            out.println("</body>");
            out.println("</html>");
            out.println("</body>");
            out.println("</html>");
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
