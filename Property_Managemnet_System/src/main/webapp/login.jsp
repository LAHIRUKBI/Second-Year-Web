<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<!--add CSS style sheet-->
      <link rel="stylesheet" href="CSS/NavigationBar.css"> <!--add CSS style sheet-->
      <link rel="stylesheet" href="CSS/login.css"> 
</head>


<body style="background-color:#D5F1E7">








<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="Edu-Exam home.php" target="_top">EXAMS</a></li>
     <li class="menu"><a href="exam.php" target="_top">REGISTATION</a></li>
	 <li class="menu"><a href="contact us.php"target="_top">CONTACT US</a></li>
	 <li class="menu"><a href="contact us2.php" target="_top">ABOUT US</a></li>
	
</ul>
<br><br><br>
     
     
     
     
     
     
     
     
 <center><h2>CUSTOMER LOGIN</h2></center><br><br>   
<!-- <img src="images/loginps.png"> -->    
<form action="CUSTOMERLOGIN" method="post">
	    
	    <center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon">
	    <table>
	         <tr>
		        <td>User Name: </td> <td><input type="text" name="uid"></td>
		     </tr>
		
		     <p style="margin-top: 10px; font-size: 14px;">Still don't have an account? <a href="customerinsert.jsp">Register</a></p>
		
		     <tr>
		        <td>Password: </td>  <td><input type="password" name="pass"></td>
		     </tr>
		</table><br>
		      <input type="submit" name="submit" value="Login">
		</center><br>
</form>













     

</body>
</html>