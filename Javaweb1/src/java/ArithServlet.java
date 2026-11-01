/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

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
@WebServlet(urlPatterns = {"/ArithServlet"})
public class ArithServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str1 = request.getParameter("txt1");
        String str2 = request.getParameter("txt2");
        PrintWriter pw = response.getWriter();  

        try{
        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        
        String operation = request.getParameter("math");
        int result;
       switch(operation){
           case "+":
               result = n1+n2;
               pw.println("Addition:"+result);
               break;
           case "-":
               result = n1-n2;
               pw.println("Substraction:"+result);
               break;
           case "*":
               result = n1*n2;
               pw.println("Multiplication:"+result);
               break;
           case "/":
               result = n1/n2;
               pw.println("Division:"+result);
               break;
               
       }    
           
       }catch (Exception e) {
            pw.println("Error: " + e.getMessage());
        }
            }
        
    }

