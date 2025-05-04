package com.drivingschool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if(session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // Add admin data here later
        request.getRequestDispatcher("admin-dashboard.jsp").forward(request, response);
    }
}
