
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Cookie cookie = new Cookie("usermail", email);
            response.addCookie(cookie);
            Cookie cookie2 = new Cookie("passcode", password);
            response.addCookie(cookie2);
            out.println("<h2> Welcome, " + cookie.getValue() + "</h2>" + "<br> <a href='displaycookies'> Click to Display Details using Cookie </a>");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
