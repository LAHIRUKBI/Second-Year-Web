<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Admin Account</title>
    <link rel="stylesheet" href="JY/seller_update.css">
    <link rel="stylesheet" href="CSS/NavigationBar.css">  
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





    <center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon"></center><br>
    <h1>Delete Admin Account</h1>

    <%-- Retrieve parameters (consider using a Java bean later) --%>
    <%
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
    %>

    <form action="seller_remove" method="post">
        <input type="hidden" name="id" value="<%= id %>" />

        <p>Are you sure you want to delete the account of:</p>
        <ul>
            <li>Admin ID: <%= id %></li>
            <li>Admin Name: <%= name %></li>
            <li>Email: <%= email %></li>
            <li>Phone: <%= phone %></li>
            <li>Username: <%= username %></li>
        </ul>

        <input type="submit" name="submit" value="Delete Account"
               onclick="return confirm('Are you absolutely sure you want to delete this admin account?')" />
    </form>

</body>
</html>
