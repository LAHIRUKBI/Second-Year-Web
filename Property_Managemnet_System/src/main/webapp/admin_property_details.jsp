<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Property Details</title>
    <link rel="stylesheet" href="CSS/NavigationBar.css">
    <link rel="stylesheet" href="CSS/Home.css">
    <link rel="stylesheet" href="CSS/useraccount.css">
    <link rel="stylesheet" href="CSS/footer.css">
    <style>
        /* Additional inline CSS styles can be added here */
        body {
            background-color: #D5F1E7;
        }
        table {
            width: 100%;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h1>Property Details</h1>

<table>
  <tr>
    <th>PID</th>
    <th>Title</th>
    <th>Type</th>
    <th>Location</th>
    <th>Description</th>
    <th>Owner Name</th>
    <th>Owner Phone</th>
    <th>Price</th>
    <th>Total Cost</th>
    <th>States</th>
    <th>Discount</th>
    <th>Actions</th>
  </tr>
  
  <c:forEach var="property" items="${pdetails}">
    <tr>
        <td>${property.pid}</td>
        <td>${property.title}</td>
        <td>${property.type}</td>
        <td>${property.location}</td>
        <td style="width: 20%"> ${property.description}</td>
        <td>${property.ownerName}</td>
        <td>${property.ownerPhone}</td>
        <td>${property.price}</td>
        <td>${property.totalcost}</td>
        <td>${property.states}</td>
        <td>${property.discount}</td>
        <td>
            <a href="admin_Approve_property.jsp?pid=${property.pid}&title=${property.title}&type=${property.type}&location=${property.location}&description=${property.description}&owner=${property.ownerName}&phone=${property.ownerPhone}&totalcost=${property.totalcost}&states=${property.states}&discount=${property.discount}&price=${property.price}">
                <button>View Details</button>
            </a>
        </td>
    </tr>
  </c:forEach>
</table>

<c:if test="${empty pdetails}">
    <p>No property details found.</p>
</c:if>

</body>
</html>
