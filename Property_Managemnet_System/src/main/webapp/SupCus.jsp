<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SupCus</title>
<link rel="stylesheet" href="CSS/SupCus.css">
</head>
<body>

<h1>All Customer Details</h1>


<table>
  <tr>
    <th>Customer ID</th>
    <th>Customer Name</th>
    <th>Customer Email</th>
    <th>Customer Phone</th>
    <th>Customer Username</th>
    <th>Customer Password</th>
    <th>Access</th>
  </tr>
  <c:forEach var="cus" items="${cusDetails}">
  <tr>
    <td>${cus.id}</td>
    <td>${cus.name}</td>
    <td>${cus.email}</td>
    <td>${cus.phone}</td>
    <td>${cus.userName}</td>
    <td>${cus.password}</td>
    <td><a href="CusSupDelete.jsp?
     
     
             &CustomerID=${cus.getId()}
             &CustomerName=${cus.getName()}
             &CustomerEmail=${cus.getEmail()}
             &CustomerPhone=${cus.getPhone()}
             &CustomerUsername=${cus.getUserName()}
             &CustomerPassword=${cus.getPassword()}">

       <button>Delete User Account</button>
     </a></td>
  </tr>
</c:forEach>  
</table>





</body>
</html>