<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supervisor Account</title>

    <link rel="stylesheet" href="CSS/NavigationBar.css">
    <link rel="stylesheet" href="CSS/SupAccount.css">
    
</head>

<body>


<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="payment.jsp" target="_top">PAYMENT</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
	 <li class="menu"><a href="about.jsp" target="_top">ABOUT US</a></li>
	 <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
</ul>










<!--CRUD part-->
<h1>Supervisor Details</h1>
<center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon">
  
  
<table> 
<c:forEach var="sup" items="${supDetails}">
 
     <c:set var="id" value="${sup.id}"/>
     <c:set var="name" value="${sup.name}"/>
     <c:set var="email" value="${sup.email}"/>
     <c:set var="phone" value="${sup.phone}"/>
     <c:set var="branch" value="${sup.branch}"/>
     <c:set var="username" value="${sup.userName}"/>
     <c:set var="password" value="${sup.password}"/>
 
 
 
  
     <tr>
         <td>Supervisor ID :</td>
         <td>${sup.id}</td>
     </tr
     >
     <tr>
        <td>Supervisor Name :</td>   
        <td>${sup.name}</td>
     </tr>
     
     <tr>
        <td>Supervisor Email :</td>   
        <td>${sup.email}</td>
     </tr>
     
     <tr>
        <td>Supervisor Phone :</td>   
        <td>${sup.phone}</td>
     </tr>
     
     <tr>
        <td>Supervisor Branch :</td>   
        <td>${sup.branch}</td>
     </tr>
     
     <tr>  
        <td>Supervisor Username :</td> 
        <td>${sup.userName}</td>
     </tr>
     
     <tr>  
        <td>Supervisor Password :</td>   
        <td>${sup.password}</td>
     </tr>
     
                
</c:forEach>
</table>







<c:url value="SupUPDATE.jsp" var="supupdate">
           <c:param name="id" value="${id}"/>
           <c:param name="name" value="${name}"/>
           <c:param name="email" value="${email}"/>
           <c:param name="phone" value="${phone}"/>
           <c:param name="branch" value="${branch}"/>
           <c:param name="uname" value="${username}"/>
           <c:param name="pass" value="${password}"/>
</c:url>


<table style="border: 0px #f9f9f9;">
<tr>
   <td>
      <div class="btn-container">
         <a href = "${supupdate}">
         <p>Update user details such as name, email, and phone number</p>
         <input type ="button" name="updtate" value="Update Supervisor Information">
         </a>
       </div>
</td>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<td>
     <c:url value="Supdelete.jsp" var="supdelete">
           <c:param name="id" value="${id}"/>
           <c:param name="name" value="${name}"/>
           <c:param name="email" value="${email}"/>
           <c:param name="phone" value="${phone}"/>
           <c:param name="branch" value="${branch}"/>
           <c:param name="uname" value="${username}"/>
           <c:param name="pass" value="${password}"/>
     </c:url>
     
     <div class="btn-container">
     <a href = "${supdelete}">
     <p>Permanently delete this supervisor account</p>
     <input type ="button" name="delete" value="Delete Supervisor Account">
     </a>
     </div>
</td>
</table>







<center>
<p>if you use customer database click view customer</p>

<form action="SupCus" method="post">
      <input type ="submit" name="delete" value="View Customers">   
</form>
</center>




</body>
</html>