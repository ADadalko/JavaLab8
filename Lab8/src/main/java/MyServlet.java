import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
        states.put(5, "Belarus");
        states.put(6, "England");
        states.put(7, "Poland");
        states.put(8, "Russia");
        states.put(9, "Portugal");
        states.put(10, "China");
        states.put(11, "USA");
        states.put(12, "Canada");
        states.put(13, "Brazil");
        states.put(14, "Argentina");
        states.put(15, "Columbia");
        states.put(16, "Ecuador");
        states.put(17, "Lithuania");
        states.put(18, "Ukraine");
        states.put(19, "Egypt");
        states.put(20, "Greece");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String key = request.getParameter("key");
        String first = states.get(Integer.parseInt(key));
            try {
                writer.println("<p>Value: " + first + "</p>");
            } finally {
                writer.close();
            }
    }
}