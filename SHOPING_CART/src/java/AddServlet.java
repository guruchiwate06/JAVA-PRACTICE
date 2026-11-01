/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Rajguru
 */
public class AddServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String prod = request.getParameter("pname");
        int qty = Integer.parseInt(request.getParameter("qty"));
            
            HttpSession session = request.getSession();
            
            ArrayList<Cart> x = (ArrayList<Cart>) session.getAttribute("x");
            
            if(x==null){
                 x = new ArrayList<>();
            }
            int f=0;
            String str;
            for(Cart item :x){
                str = item.getPname();
                if(str.equals(prod)){
                    item.qty = item.getQty()+ qty;
                    f=1;
                    break;
                }
            }
            if(f==0){
               int rate;
               if(prod.equals("Orange")){
                   rate=20;
               }
               else if(prod.equals("banana")){
                   rate=5;
               }
               else{
                   rate=60;
               }
               Cart y = new Cart(prod,qty,rate);
               x.add(y);
            }
            session.setAttribute("x",x);
            PrintWriter pw = response.getWriter();
            pw.println("<br>Product Added Sucessfully<br>");
            pw.println("<a href='index.html'>Go Back</a>");
    }

    

}
