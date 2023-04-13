
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String name = req.getParameter("uname");

        HttpSession session = req.getSession();
        session.setAttribute("uname", name);

        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();
        pw.println("<a href=\"HiServlet\" >Go to Hi Servlet</a>");
        pw.close();
    }

}
