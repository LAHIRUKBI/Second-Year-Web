<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supdelete</title>
<link rel="stylesheet" href="CSS/NavigationBar.css">
<link rel="stylesheet" href="CSS/deletecustomer.css">
</head>
<body>



<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="Edu-Exam home.php" target="_top">Registration</a></li>
     <li class="menu"><a href="exam.php" target="_top">REGISTATION</a></li>
	 <li class="menu"><a href="contact us.php"target="_top">CONTACT US</a></li>
	 <li class="menu"><a href="contact us2.php" target="_top">ABOUT US</a></li>
     <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
</ul>


<center><h1 style="font-size: 3em; margin: 0; color: black; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">Supervisor Account Delete</h1>
        <p>Are you sure you want to delete your account? This action cannot be undone</p>
</center>


 <%
         
         String id = request.getParameter("id");
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String phone = request.getParameter("phone");
         String branch = request.getParameter("branch");
         String userName = request.getParameter("uname");
         String password = request.getParameter("pass");
         
     
 %>




     <form action="supdelete" method = "post">
     
          Supervisor ID           : <input type="text" name="supid" value="<%= id %>" readonly><br><br>
          Supervisor Name         : <input type="text" name="name" value="<%= name %>" readonly><br><br>
          Supervisor Email        : <input type="text" name="email" value="<%= email %>" readonly><br><br>
          Supervisor Phone Number : <input type="text" name="phone" value="<%= phone %>" readonly><br><br>
          Branch                  : <input type="text" name="branch" value="<%= branch %>"><br><br>
          User Name               : <input type="text" name="uname" value="<%= userName %>" readonly><br><br>
          Password                : <input type="password" name="pass" value="<%= password %>" readonly><br><br>
          
          <input type="submit" name="submit" value="Delete Supervisor Account">
          
     
     </form>
     
     
     


</body>
</html>