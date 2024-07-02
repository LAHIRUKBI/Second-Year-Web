<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin index</title>
  <link rel="stylesheet" href="JY/admin_index.css">
  <link rel="stylesheet" href="CSS/NavigationBar.css">
  
</head>
<body  style="background-color:#D5F1E7">





<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
     <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>






<c:forEach var="admin" items="${addetails}">
   <center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon"><br>
  <p style="font-family: Arial, sans-serif; font-size: 16px; color: #333; line-height: 1.5;">Take full control of your website with our streamlined Administrator's Web Panel. Effortlessly manage users,
   content, and performance with intuitive tools and robust analytics. Enjoy enhanced security features and customizable
    options tailored to your needs. With 24/7 support, your website is in capable hands. Experience seamless management 
    and unlock your website's full potential today</p>
  <h1>Admin Panel</h1>
  <p>Welcome, <span id="adminName">${admin.username}</span></p>

  <form action="addetails" method="post">
    <input type="submit" value="View Your Admin Details">
     <input type="hidden" name = "adminName" value="${admin.username}">
  </form>

  <form action="pendingproperty" method="post">
    <input type="submit" value="View Pending Property Details">
  </form>

  <form action="approve" method="post">
    <input type="submit" name="view_approve" value="View Approved Property Details">
  </form>

  <form action="approve" method="post">
    <input type="submit" name="view_disapprove" value="View Disapproved Property Details">
  </form>
  
    <form action="admin_property_insert.jsp" method="post">
    <input type="submit" name="insert_property" value="add property manually ">
  </form>

</c:forEach>

</body>
</html>
