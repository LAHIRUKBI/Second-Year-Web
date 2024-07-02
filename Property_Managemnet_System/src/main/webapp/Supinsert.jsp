<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/NavigationBar.css">
<link rel="stylesheet" href="CSS/customerinsert.css">
</head>
<body>


<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="Edu-Exam home.php" target="_top">EXAMS</a></li>
     <li class="menu"><a href="exam.php" target="_top">REGISTATION</a></li>
	 <li class="menu"><a href="contact us.php"target="_top">CONTACT US</a></li>
	 <li class="menu"><a href="contact us2.php" target="_top">ABOUT US</a></li>
	
</ul>
<br><br><br>





 <form action="supinsert" method="post">
      
           Name         : <input type="text" name="name"><br><br>
           Email        : <input type="text" name="email"><br><br>
           Phone Number : <input type="text" name="phone"><br><br>
           Branch Name : <input type="text" name="bra"><br><br>
           User Name    : <input type="text" name="uid"><br><br>
           Password     : <input type="password" name="psw"><br><br>
      
           <input type="submit" name="submit" value ="Register"><br>
           
 </form>

</body>
</html>