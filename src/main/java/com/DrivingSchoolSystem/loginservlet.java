package com.DrivingSchoolSystem;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
class LoginServlet extends HttpServlet {
    // Process the login request (POST)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the user input (email and password)
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hash the input password to compare it with the hashed password in the database
        String hashedPassword = PasswordUtil.encrypt(password);

        // Call AuthService or a similar service directly to validate user credentials
        if (AuthService.validateUser(email, hashedPassword)) {
            // If valid credentials, create a session for the user
            HttpSession session = request.getSession();
            session.setAttribute("user", AuthService.getUser(email)); // Store user object in session

            // Redirect to dashboard (or any other page)
            response.sendRedirect("dashboard.jsp"); // Replace with the actual dashboard URL
        } else {
            // If credentials are invalid, set an error message
            request.setAttribute("error", "Invalid credentials, please try again.");
            // Forward to the login page with the error message
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // Process the login request (GET)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Simply forward the GET request to the login page (if needed)
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
