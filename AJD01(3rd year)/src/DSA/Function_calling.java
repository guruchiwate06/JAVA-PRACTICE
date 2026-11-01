import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try {

            Connection con = DBConnect.getConnection();

            String sql = "SELECT * FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                out.println("<h2>Student Details</h2>");

                out.println("ID: " + rs.getInt("id"));
                out.println("<br>");

                out.println("Name: " + rs.getString("name"));
                out.println("<br>");

                out.println("Email: " + rs.getString("email"));
                out.println("<br>");

                out.println("Course: " + rs.getString("course"));
                out.println("<br>");

                out.println("Age: " + rs.getInt("age"));

            } else {

                out.println("<h2>Student Not Found</h2>");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            out.println(e);
        }
    }
}