<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
       <link rel="stylesheet" href="CSS/updatecustomer.css">
       <link rel="stylesheet" href="CSS/NavigationBar.css">
       
       <script>
           function validateForm() {
               var name = document.forms["updateForm"]["name"].value;
               var email = document.forms["updateForm"]["email"].value;
               var phone = document.forms["updateForm"]["phone"].value;
               var userName = document.forms["updateForm"]["uname"].value;
               var password = document.forms["updateForm"]["pass"].value;

               if (name == "" || email == "" || phone == "" || userName == "" || password == "") {
                   alert("Please fill in all fields.");
                   return false;
               }
           }
       </script>
       
</head>
<body>







<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">USER</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>


	 <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>











     <%
         
         String id = request.getParameter("id");
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String phone = request.getParameter("phone");
         String userName = request.getParameter("uname");
         String password = request.getParameter("pass");
         
     
     %>




     <form name="updateForm" action="UPDATE" method = "post"  onsubmit="return validateForm()">
     
     <center><h1>CUSTOMER PROFILE</h1>
     <img src="images/User.png" width="20%" height="10%"></center><br>
          Customer ID  : <input type="text" name="cusid" value="<%= id %>" readonly><br><br>
          Name         : <input type="text" name="name" value="<%= name %>"><br><br>
          Email        : <input type="text" name="email" value="<%= email %>"><br><br>
          Phone Number : <input type="text" name="phone" value="<%= phone %>"><br><br>
          User Name    : <input type="text" name="uname" value="<%= userName %>"><br><br>
          Password     : <input type="password" name="pass" value="<%= password %>"><br><br>
          
          <input type="submit" name="submit" value="Update My Data">
          
     
     </form>


</body>
</html>