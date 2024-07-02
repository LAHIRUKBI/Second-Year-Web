<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Seller Details</title>
    <link rel="stylesheet" href="JY/seller_update.css">
    <link rel="stylesheet" href="CSS/NavigationBar.css">  
    <style>
       
    </style>
</head>
<body style="background-color:#D5F1E7">



<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
     <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>






    <h1>Update Seller Details</h1>

   
    <%
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    %>

    <form action="seller_update" method="post">
        <input type="hidden" name="id" value="<%= id %>" />

        <label for="name">Admin Name:</label>
        <input type="text" name="name" id="name" value="<%= name %>" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="<%= email %>" required><br>

        <label for="phone">Phone Number:</label>
        <input type="text" name="phone" id="phone" value="<%= phone %>" required><br>

        <label for="username">Username:</label>
        <input type="text" name="username" id="username" value="<%= username %>" required><br>

       
       <br>  <input type="submit" name="submit" value="Update Seller">
    </form>

</body>
</html>
