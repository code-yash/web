import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class movies extends HttpServlet {

    private List<Movie> movies = new ArrayList<Movie>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("[");
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            out.println("{\"title\":\"" + movie.getTitle() + "\"}" + (i == movies.size() - 1 ? "" : ","));
        }
        out.println("]");
        out.close();
    }

    @Override
    public void init() throws ServletException {
        // Populate the list of movies
        movies.add(new Movie("The Godfather"));
        movies.add(new Movie("The Shawshank Redemption"));
        movies.add(new Movie("The Dark Knight"));
        movies.add(new Movie("Forrest Gump"));
    }

    class Movie {
        private String title;
        private int year;

        public Movie(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
