package com.drivingschool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple validation (replace with database check later)
        if("admin".equals(username) && "admin123".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("admin-dashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid credentials");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}