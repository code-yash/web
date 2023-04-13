
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class displaycookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            Cookie[] cook = request.getCookies();
            String cookiename;
            String value;
            if (cook == null) {
                out.println("<h1> You are a new user. Go to homepage and register! </h1>");
            } else {
                for (Cookie ck : cook) {
                    cookiename = ck.getName();
                    value = ck.getValue();
                    out.println("<br>" + "<h2> Cookie Name: " + cookiename + "<br>Value: " + value + "</h2><br><br>");
                }
            }

        }
    }
}
