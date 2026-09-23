package com.example.movie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class MovieServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Movie Website</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Welcome to Movie Website</h1>");
        out.println("<h2>DevOps Project</h2>");

        out.println("<p>Java</p>");
        out.println("<p>Maven</p>");
        out.println("<p>WAR</p>");
        out.println("<p>Tomcat</p>");
        out.println("<p>Docker</p>");
        out.println("<p>Jenkins</p>");
        out.println("<p>SonarQube</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
