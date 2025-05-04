<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Course</title>
</head>
<body>
<h2>Add New Driving Course</h2>
<form action="AddCourseServlet" method="post">
    Course Name: <input type="text" name="name" required><br><br>
    Duration (weeks): <input type="number" name="duration" required><br><br>
    Fee ($): <input type="number" name="fee" required><br><br>
    <input type="submit" value="Add Course">
</form>
<br>
<a href="index.jsp">Back to Home</a>
</body>
</html>
