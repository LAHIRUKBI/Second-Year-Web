<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/updatecustomer.css">


<script>
    function validateForm() {
        var name = document.forms["updateForm"]["name"].value;
        var email = document.forms["updateForm"]["email"].value;
        var phone = document.forms["updateForm"]["phone"].value;
        var branch = document.forms["updateForm"]["branch"].value;
        var userName = document.forms["updateForm"]["uname"].value;
        var password = document.forms["updateForm"]["pass"].value;

        if (name === "" || email === "" || phone === "" || branch === "" || userName === "" || password === "") {
            alert("Please fill in all fields.");
            return false;
        }
    }
</script>



</head>
<body>



<!--write java code use this mark.thease data come to Supaccount.jsp page-->
     <%
         
         String id = request.getParameter("id");
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String phone = request.getParameter("phone");
         String branch = request.getParameter("branch");
         String userName = request.getParameter("uname");
         String password = request.getParameter("pass");
         
     
     %>




     <form name="updateForm" action="supupdate" method = "post" onsubmit="return validateForm()">
     <center><h1>Manage customer access levels here</h1>
     <img src="images/User.png" width="20%" height="10%"></center><br>
          Supervisor ID: <input type="text" name="supid" value="<%= id %>" readonly><br><br>
          Name         : <input type="text" name="name" value="<%= name %>"><br><br>
          Email        : <input type="text" name="email" value="<%= email %>"><br><br>
          Phone Number : <input type="text" name="phone" value="<%= phone %>"><br><br>
          Branch       : <input type="text" name="branch" value="<%= branch %>"><br><br>
          User Name    : <input type="text" name="uname" value="<%= userName %>"><br><br>
          Password     : <input type="password" name="pass" value="<%= password %>"><br><br>
          
          <input type="submit" name="submit" value="Update My Data">
          
     
     </form>
     
     

</body>
</html>