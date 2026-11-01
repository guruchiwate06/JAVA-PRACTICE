import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ViewCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        HttpSession session = request.getSession();

        ArrayList<Cart> x =
                (ArrayList<Cart>) session.getAttribute("x");

        if (x == null) {

            pw.println("Cart is empty");

        } else {

            int total = 0;

            for (Cart item : x) {

                int amount = item.getQty() * item.getRate();

                pw.println("<br>Product: " + item.getPname());
                pw.println("<br>Quantity: " + item.getQty());
                pw.println("<br>Rate: " + item.getRate());
                pw.println("<br>Amount: " + amount);
                pw.println("<br><br>");

                total = total + amount;
            }

            pw.println("<br>Total Amount: " + total);
        }

        pw.println("<br><br>");
        pw.println("<a href='index.html'>Go Back</a>");
    }
}