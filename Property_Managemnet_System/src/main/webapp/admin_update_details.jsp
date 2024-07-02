<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin update Details</title>
    <link rel="stylesheet" href="JY/admin_update_details.css">
    <link rel="stylesheet" href="CSS/NavigationBar.css">
    <style>
        /* Add CSS styles for better presentation (optional) */
    </style>
</head>
<body>

    <h1>Update Admin Details</h1>

    <%-- Retrieve parameters (consider using a Java bean later) --%>
    <%
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    %>

    <form action="update" method="post">
        <input type="hidden" name="id" value="<%= id %>" />

        <label for="name">Admin Name:</label>
        <input type="text" name="name" id="name" value="<%= name %>" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="<%= email %>" required><br>

        <label for="phone">Phone Number:</label>
        <input type="text" name="phone" id="phone" value="<%= phone %>" required><br>

        <label for="username">Username:</label>
        <input type="text" name="username" id="username" value="<%= username %>" required><br>

        <label for="password">Password:</label>
       <br>  <input type="submit" name="submit" value="Update Admin">
    </form>

</body>
</html>
