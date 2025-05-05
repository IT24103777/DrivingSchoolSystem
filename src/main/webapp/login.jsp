<%--
  Created by IntelliJ IDEA.
  User: Malee
  Date: 05/05/2025
  Time: 02:01
  To change this template use File | Settings | File Templates.
--%>

<%-- File: src/main/webapp/WEB-INF/views/login.jsp --%>
<%@ page contentType="text/html;charset=UTF-8" %>

<head>
    <title>Login - ABC Driving School</title>
    <link rel="stylesheet" href="login/css/style.css">
</head>
<body>
<div class="container">
    <h1>Welcome to ABC Driving School</h1>
    <h2>Login</h2>
    <form action="login" method="post">
        <label>
            <input type="text" name="username" placeholder="Username" required/>
        </label><br>
        <label>
            <input type="password" name="password" placeholder="Password" required/>
        </label><br>
        <button type="submit">Login</button>
    </form>
    <p style="color:red;"><%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %></p>
    <a href="register.jsp">Create Account</a> | <a href="forgot.jsp">Forgot Password?</a>
</div>
</body>
