<%--
  Created by IntelliJ IDEA.
  User: Malee
  Date: 05/05/2025
  Time: 02:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Admin Dashboard</title>
  <style>
    body { font-family: Arial; margin: 50px; }
    .header { display: flex; justify-content: space-between; }
    .menu { margin-top: 30px; }
    .menu a { margin-right: 15px; }
  </style>
</head>
<body>
<div class="header">
  <h1>Admin Dashboard</h1>
  <div>
    Welcome, <%= session.getAttribute("username") %> |
    <a href="logout">Logout</a>
  </div>
</div>

<div class="menu">
  <h3>Administration Menu</h3>
  <a href="students">Manage Students</a>
  <a href="instructors">Manage Instructors</a>
  <a href="courses">Manage Courses</a>
</div>
</body>
</html>
