<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

    <title>Approved Property Details</title>
    <link rel="stylesheet" type="text/css" href="JY/admin_approved_propert_details.css">
    <link rel="stylesheet" href="CSS/NavigationBar.css">
    
</head>
<body style="background-color:#D5F1E7">




<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>


	 <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>
<br><br><br><br>


<center>
<img src="images/setting.png" width="100px" height="100px" class="logo">
<h1>Approved Property Details</h1></center><br><br>

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
    <th>totalcost</th>
    <th>states</th>
    <th>discount</th>
    <th>Access</th>
    
  </tr>
  <c:forEach var="property" items="${apdetails}">
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
            <a href="admin_Approve_property.jsp?pid=${property.getPid()}&title=${property.getTitle()}&type=${property.getType()}&location=${property.getLocation()}&description=${property.getDescription()}&owner=${property.getOwnerName()}&phone=${property.getOwnerPhone()}&price=${property.getPrice()}&totalcost=${property.getTotalcost()}&states=${property.getStates()}&discount=${property.getDiscount()}">
                <button>View Details</button>
            </a>
            
  
        </td>
    </tr>
  </c:forEach>
</table>
<br><br>
<c:if test="${empty pdetails}">
   <center> <p>No property details found.</p></center>
</c:if>

</body>
</html>
