package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet {

    // Handles GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Get the writer to send the response
        PrintWriter out = response.getWriter();

        // HTML response content
        out.println("<html><body>");
        out.println("<h1>Hello from the Java Web App!</h1>");
        out.println("<p>This is a simple servlet-based web application built with Maven.</p>");
        out.println("</body></html>");
    }
}
