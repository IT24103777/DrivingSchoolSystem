<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password - ABC Driving School</title>
    <style>
        body {
            background: url("img/bg.jpg") no-repeat center center fixed;
            background-size: cover;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .forgot-container {
            background-color: rgba(255, 255, 255, 0.95);
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.25);
            width: 400px;
            text-align: center;
        }

        .forgot-container h2 {
            margin-bottom: 20px;
            color: #004080;
        }

        .forgot-container input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 10px;
            font-size: 15px;
        }

        .forgot-container input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #004080;
            color: white;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 15px;
        }

        .forgot-container input[type="submit"]:hover {
            background-color: #002f66;
        }
    </style>
</head>
<body>
<div class="forgot-container">
    <h2>Forgot Password?</h2>
    <form action="forgot" method="post">
        <input type="text" name="username" placeholder="Enter your username"><br>
        <input type="submit" value="Recover">
    </form>
</div>
</body>
</html>
