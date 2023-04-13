
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author yashs
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("email");
            String password = request.getParameter("password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javaproject?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String pass = "admin";
            Connection con = DriverManager.getConnection(url, username, pass);

            PreparedStatement st = con.prepareStatement("select * from logindetails where email=? and password=? ");
            st.setString(1, name);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                out.println("<h4> User:- " + name + " login successful! </h4>");
                out.println("<a href=\"index.html\"> Click here to Logout! </a>");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
