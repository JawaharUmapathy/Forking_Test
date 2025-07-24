import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Dummy authentication (replace with database/auth logic)
        if ("anbu".equals(username) && "totoya123".equals(password)) {
            out.println("<h2>Login successful! Welcome, " + username + ".</h2>");
        } else {
            out.println("<h2>Invalid credentials. Please try again.</h2>");
            out.println("<a href='login.html'>Back to Login</a>");
        }
    }
}
