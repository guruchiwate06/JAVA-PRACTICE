import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RemoveCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        HttpSession session = request.getSession();

        ArrayList<Cart> x =
                (ArrayList<Cart>) session.getAttribute("x");

        if (x == null || x.isEmpty()) {

            pw.println("Cart is empty");

        } else {

            x.remove(x.size() - 1);

            session.setAttribute("x", x);

            pw.println("Product removed successfully");
        }

        pw.println("<br><br>");
        pw.println("<a href='ViewCart'>View Cart</a>");
    }
}