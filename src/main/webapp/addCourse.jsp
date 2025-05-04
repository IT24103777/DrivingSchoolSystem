<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Course</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            padding: 30px;
        }
        h2 {
            color: #333;
        }
        .form-container {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            max-width: 400px;
            margin: auto;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        a {
            display: block;
            margin-top: 15px;
            text-align: center;
            color: #007bff;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Add New Driving Course</h2>
    <form action="AddCourseServlet" method="post">
        <label>Course Name:</label>
        <input type="text" name="name" required>

        <label>Duration (weeks):</label>
        <input type="number" name="duration" required>

        <label>Fee ($):</label>
        <input type="number" name="fee" required>

        <input type="submit" value="Add Course">
    </form>
    <a href="index.jsp">Back to Home</a>
</div>
</body>
</html>
