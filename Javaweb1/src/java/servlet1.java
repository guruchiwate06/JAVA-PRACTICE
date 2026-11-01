/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Rajguru
 */
@WebServlet(urlPatterns = {"/servlet1"})
public class servlet1 extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String str = request.getParameter("txtid"); 
       //Create Attributes
       request.setAttribute("a",str);
       //created object of RequestDispatcher
       RequestDispatcher rd = request.getRequestDispatcher("servlet2");
       rd.forward(request,response);
   }
        
   
    }



