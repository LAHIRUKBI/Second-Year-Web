<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin account</title>
    <link rel="stylesheet" href="JY/admin_account.css">
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
	 
</ul><br><br><br>







    <h1>Admin Details</h1>
    
    <c:forEach var="admin" items="${addetails}">
    <center>
    <table>
             
            <tr><td>Admin ID:   </td> <td>${admin.id}</td></tr>
            <tr><td>Admin Name:</td>  <td>${admin.name}</td></tr>
            <tr><td>Username:  </td>  <td> ${admin.username}</td></tr>
            <tr><td>Email:     </td>  <td>${admin.email}</td></tr>
            <tr><td>Phone:     </td>  <td>${admin.phone}</td></tr>
      





        <c:url value="admin_update_details.jsp" var="adminupdate">
            <c:param name="id" value="${admin.id}" />
            <c:param name="name" value="${admin.name}" />
            <c:param name="email" value="${admin.email}" />
            <c:param name="phone" value="${admin.phone}" />
            <c:param name="username" value="${admin.username}" />
          
        </c:url>
        <tr><td>
        <a href="${adminupdate}">
            <input type="button" name="update" value="Update Data" />
        </a>
        </td>
        
        <c:url value = "admin_delete.jsp" var = "delectAdmin">
	
		<c:param name = "id" value = "${admin.id}"/>
		<c:param name = "name" value = "${admin.name}"/>
		<c:param name = "email" value = "${admin.email}"/>
		<c:param name = "phone" value = "${admin.phone}"/>
		<c:param name = "username" value = "${admin.username}"/>
		<c:param name = "username" value = "${admin.username}"/>
		<c:param name = "password" value = "${admin.password}"/>
		
	    </c:url>
	<td>
	<a href = "${delectAdmin}">
	
	<input type="button"name ="delect" value ="delect my account">
	</a>
	</td>
	<tr>
	</table>
	</center> 
    </c:forEach>

</body>
</html>
