<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CusSupDelete</title>
<link rel="stylesheet" href="CSS/CusSupDelete.css">

</head>
<body>




<%
         
         String id = request.getParameter("CustomerID");
         String name = request.getParameter("CustomerName");
         String email = request.getParameter("CustomerEmail");
         String phone = request.getParameter("CustomerPhone");
         String userName = request.getParameter("CustomerUsername");
         String password = request.getParameter("CustomerPassword");
         
     
 %>


<h1>Customer Delete Panle</h1>



     <form action="SUPCUSDELETE" method = "post">
     
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