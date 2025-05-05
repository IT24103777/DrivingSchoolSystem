package com.DrivingSchoolSystem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/reset-password")
public class PasswordResetServlet extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");

        User user = UserDB.findByEmail(email); // Search user by email

        if (user != null) {
            String encryptedPassword = PasswordUtil.encrypt(newPassword);
            user.setPassword(encryptedPassword); // Update the password
            response.sendRedirect("login.html?reset=true"); // Redirect to login page with success
        } else {
            request.setAttribute("error", "No account found with this email.");
            request.getRequestDispatcher("forgot-password.html").forward(request, response);
        }
    }
}
