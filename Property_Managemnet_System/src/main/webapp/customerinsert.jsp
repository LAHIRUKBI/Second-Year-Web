<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/customerinsert.css">
</head>
<body>

<h1>Customer Register Form</h1>
<div class="container">
<p>Welcome to Pool Of Property</p>

<p>We're thrilled to have you on board. Get ready for an incredible journey filled with exclusive benefits and personalized experiences.
 As a valued member, your satisfaction is our priority. Feel free to reach out anytime. Let's make amazing memories together!</p>
 </div>     
      <form action="INSERT" method="post">
      
           Name         : <input type="text" name="name"><br><br>
           Email        : <input type="text" name="email"><br><br>
           Phone Number : <input type="text" name="phone"><br><br>
           User Name    : <input type="text" name="uid"><br><br>
           Password     : <input type="password" name="psw"><br><br>
      
           <input type="submit" name="submit" value ="Register"><br>
           
      </form>




</body>
</html>