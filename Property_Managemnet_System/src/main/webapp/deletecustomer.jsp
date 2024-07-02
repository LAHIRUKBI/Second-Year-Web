<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deletecustomer</title>
<link rel="stylesheet" href="CSS/NavigationBar.css">
<link rel="stylesheet" href="CSS/deletecustomer.css">
</head>
<body style="background-color: #B8C6D6">




<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>


	 <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>

<center><h1 style="font-size: 3em; margin: 0; color: black; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">User Account Delete</h1>
        <p>Are you sure you want to delete your account? This action cannot be undone.</p>
</center>


     <%
         
         String id = request.getParameter("id");
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String phone = request.getParameter("phone");
         String userName = request.getParameter("uname");
         String password = request.getParameter("pass");
         
     
     %>


     <form action="DELETE" method = "post">
     
     <center><img src="images/User.png" width="20%" height="10%"></center><br>
     
     
          Customer ID  : <input type="text" name="cusid" value="<%= id %>" readonly><br><br>
          Name         : <input type="text" name="name" value="<%= name %>" readonly><br><br>
          Email        : <input type="text" name="email" value="<%= email %>" readonly><br><br>
          Phone Number : <input type="text" name="phone" value="<%= phone %>" readonly><br><br>
          User Name    : <input type="text" name="uname" value="<%= userName %>" readonly><br><br>
          Password     : <input type="password" name="pass" value="<%= password %>" readonly><br><br>
          
          <input type="submit" name="submit" value="Delete User Account">
          
     
     </form>



</body>
</html>