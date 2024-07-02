<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>seller Details</title>
    <link rel="stylesheet" href="JY/seller_account.css">
    <link rel="stylesheet" href="CSS/NavigationBar.css">
</head>
<body>






<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
     <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>









    <h1>Seller Details</h1>

    <c:forEach var="seller" items="${seller_details}">
        <div class="seller-info">
  <table>
  <tr>
    <td>Seller ID:</td>
    <td>${seller.id}</td>
  </tr>
  <tr>
    <td>Seller Name:</td>
    <td>${seller.name}</td>
  </tr>
  <tr>
    <td>Username:</td>
    <td>${seller.username}</td>
  </tr>
  <tr>
    <td>Email:</td>
    <td>${seller.email}</td>
  </tr>
  <tr>
    <td>Phone:</td>
    <td>${seller.phone}</td>
  </tr>

 <tr>   
</div>

      <td>  <c:url value="seller_update.jsp" var="sellerupdate">
            <c:param name="id" value="${seller.id}" />
            <c:param name="name" value="${seller.name}" />
            <c:param name="email" value="${seller.email}" />
            <c:param name="phone" value="${seller.phone}" />
            <c:param name="username" value="${seller.username}" />
          
            </c:url>

        <a href="${sellerupdate}">
            <input type="button" name="update" value="Update Data" />
        </a>
        </td>
        <td>
<c:url value = "seller_delete.jsp" var = "delectseller">
	
		<c:param name = "id" value = "${seller.id}"/>
		<c:param name = "name" value = "${seller.name}"/>
		<c:param name = "email" value = "${seller.email}"/>
		<c:param name = "phone" value = "${seller.phone}"/>
		<c:param name = "username" value = "${seller.username}"/>
		<c:param name = "username" value = "${seller.username}"/>
		<c:param name = "password" value = "${seller.password}"/>
		
	 </c:url>
	
	<a href = "${delectseller}">
	
	<input type="button"name ="delect" value ="delect my account">
	</a>
    </c:forEach>
    </td>
    </tr>
</table>
</body>
</html>
