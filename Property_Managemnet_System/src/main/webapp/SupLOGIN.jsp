<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="CSS/NavigationBar.css">
<link rel="stylesheet" href="CSS/SupLOGIN.css">
<link rel="stylesheet" href="CSS/footer.css">



</head>
<body>



<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="Edu-Exam home.php" target="_top">EXAMS</a></li>
     <li class="menu"><a href="exam.php" target="_top">REGISTATION</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
	 <li class="menu"><a href="contact us2.php" target="_top">ABOUT US</a></li>
	
</ul>
<br><br><br>




<center><h2>SUPERVISOR LOGIN</h2></center><br><br>





<form action="suplogin" method="post">

    
	<center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon">
    <table>
          <tr>
             <td>Branch Name:</td><td> <input type="text" name="bran"></td>
          </tr>
          <tr>
             <td>Supervisor User Name</td><td><input type="text" name="uid"></td>
          </tr>
          <tr>
             <td>Supervisor Password </td><td><input type="password" name="pass"></td>
          </tr>
          <tr>
             <td><input type="submit" name="submit" value="Login"></td>
             <td><p style="margin-top: 10px; font-size: 14px;">Still don't have an account? <a href="Supinsert.jsp" style="color: #007bff; text-decoration: none;">Register</a></p></td>
          </tr>
    </table>
    
</form>




















</body>
</html>