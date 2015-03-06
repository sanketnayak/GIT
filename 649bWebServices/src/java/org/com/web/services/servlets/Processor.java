/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.com.web.services.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import org.com.backend.generator.VMMaker;
import org.com.backend.generator.VagrantFile;

/**
 *
 * @author sanketnayak
 */
@WebServlet(name = "Processor", urlPatterns = {"/Processor"})
public class Processor extends HttpServlet {

    int count = 5;
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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Processor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Processor at " + (String)request.getParameter("name") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        
        
        String name = request.getParameter("name");
        String os = request.getParameter("os");
        
        boolean java = Boolean.parseBoolean(request.getParameter("java"));
        boolean tomcat = Boolean.parseBoolean(request.getParameter("tomcat"));
        boolean mysql = Boolean.parseBoolean(request.getParameter("mysql"));
        boolean ruby = Boolean.parseBoolean(request.getParameter("ruby"));
        boolean perl = Boolean.parseBoolean(request.getParameter("perl")); 
        
        request.setAttribute("java", Boolean.toString(java));
        request.setAttribute("tomcat", Boolean.toString(tomcat));
        request.setAttribute("mysql", Boolean.toString(mysql));
        request.setAttribute("ruby", Boolean.toString(ruby));
        request.setAttribute("java", Boolean.toString(perl));
        
        count++;    
        
        String ip = "192.168.50."+Integer.toString(count);
        request.setAttribute("ip", ip);
        VagrantFile.VigrantFileGenerator(name, os, java, tomcat, mysql, ruby, perl,ip);
        String p = VMMaker.executeCommand("sudo sh /Users/sanketnayak/"+name+"/vagrant.sh", Runtime.getRuntime());
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        out.println("<!-- Start Styles. Move the 'style' tags and everything between them to between the 'head' tags -->");
        out.println("<style type=\"text/css\">");
        out.println(".myTable { width:400px;background-color:#eee;border-collapse:collapse; }");
        out.println(".myTable th { background-color:#000;color:white;width:50%; }");
        out.println(".myTable td, .myTable th { padding:5px;border:1px solid #000; }");
        out.println("</style>");
        out.println("<!-- End Styles -->");
        out.println("<table class=\"myTable\">");
        out.println("<tr>");
        out.println("<th>Settings</th><th>Value</th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>IP Address</td><td>" + ip + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Java</td><td>" + java + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Tomcat</td><td>" + tomcat + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>MySQL</td><td>" + mysql + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Ruby</td><td>" + ruby + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Perl</td><td>" + perl + "</td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("");

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
