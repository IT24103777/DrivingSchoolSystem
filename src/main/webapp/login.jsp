<%--
  Created by IntelliJ IDEA.
  User: Malee
  Date: 05/05/2025
  Time: 02:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Driving School - Login</title>
    <style>
        body { font-family: Arial; margin: 50px; }
        .login-form { width: 300px; margin: 0 auto; }
        .error { color: red; }
    </style>
</head>
<body>
<div class="login-form">
    <h2>Login</h2>
    <% if(request.getAttribute("error") != null) { %>
    <p class="error"><%= request.getAttribute("error") %></p>
    <% } %>
    <form action="login" method="post">
        <div>
            <label>Username:</label>
            <input type="text" name="username" required>
        </div>
        <div>
            <label>Password:</label>
            <input type="password" name="password" required>
        </div>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>
