<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Property Details</title>
    <style>
        table {
            width: 100%; /* Set width to 100% for responsiveness */
            border-collapse: collapse;
        }

        th, td {
            text-align: left;
            padding: 10px;
            border: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
    </style>
</head>
<body>

<h1>Property Details</h1>

<table style="width:100%">
  <tr>
    <th>PID</th>
    <th>Title</th>
    <th>Type</th>
    <th>Location</th>
    <th>Description</th>
    <th>Owner Name</th>
    <th>Owner Phone</th>
    <th>Price</th> 
    <th>Total bill</th>
    <th>status</th>
    <th>Discount</th>
    
    
    
  </tr>
  <c:forEach var="property" items="${pdetails}">
    <tr>
        <td>${property.getPid()}</td>
        <td>${property.getTitle()}</td>
        <td>${property.getType()}</td>
        <td>${property.getLocation()}</td>
        <td style="width: 20%"> ${property.getDescription()}
        </td>
        <td>${property.getOwnerName()}</td>
        <td>${property.getOwnerPhone()}</td>
        <td>${property.getPrice()}</td>
        <td>${property.getTotalcost()}</td>
        <td>${property.getStates()}</td>
        <td>${property.getDiscount()}</td>
        <td>
            <a href="seller_property_details.jsp?
            
            &pid=${property.getPid()}
            &title=${property.getTitle()}
            &type=${property.getType()}
            &location=${property.getLocation()}
            &description=${property.getDescription()}
            &owner=${property.getOwnerName()}
            &phone=${property.getOwnerPhone()}
            &price=${property.getPrice()}
            &totalcost=${property.getTotalcost()}
            &states=${property.getStates()}
            &discount=${property.getDiscount()}">
            
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
