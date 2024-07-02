<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Seller Index</title>
  <link rel="stylesheet" href="JY/seller_index.css">
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










<center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon"></center><br>
<c:forEach var="seller" items="${seller_details}">

  <h1>Selle dash board</h1>
  <p>Welcome, <span id="seller_name">${seller.username}</span></p>
  

  <form action="seller_details" method="post">
            <input type="hidden" name = "sellername" value="${seller.username}">
            <input type="submit" value="View my seller account">
	        
	
  </form>
  
   <a href="seller_property_insert.jsp? &phone= ${seller.phone} &username= ${seller.username}  &name= ${seller.name}">
                <button>Publish advertistment</button>
                </a>
            
                
                
                

  <form action="advertistment" method="post">
   <input type="hidden" name = "owner" value="${seller.name}">
   <input type="hidden" name = "phone" value="${seller.phone}">
    <input type="submit"  value="View my advertistments">
  </form>

 
</c:forEach>

</body>
</html>
