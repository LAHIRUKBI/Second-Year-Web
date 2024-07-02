<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<% 
   
    String pid = request.getParameter("pid");
    String title = request.getParameter("title");
    String type = request.getParameter("type");
    String location = request.getParameter("location");
    String description = request.getParameter("description");
    String owner = request.getParameter("owner");
    String phone = request.getParameter("phone");
   
    String price = request.getParameter("price");
    String totalcost = request.getParameter("totalcost");
    String states = request.getParameter("states");
    String discount = request.getParameter("discount");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Property Details (PID:<%= pid %>)</title>
    <link rel="stylesheet" href="JY/admin_Approve_property.css">
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
	
</ul><br><br><br><br>

<img src="images/Logo.png" width="300px" height="300px" class="logo" style="display: block; margin: 0 auto;">

<p style="font-family: Arial, sans-serif; font-size: 18px; color: #555; text-align: justify; line-height: 1.6; padding: 20px; background-color: #f9f9f9; border-radius: 8px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);">Welcome to our Property Details page, where you can explore comprehensive information about various properties.
 From residential homes to commercial spaces, find detailed descriptions, images, and contact details for each listing.
  Whether you're looking to buy, rent, or invest, our platform provides the tools you need to make informed decisions about your next property venture.</p><br><br><br>

    <h2>Property Details (PID:<%= pid %>)</h2>
    <form action = "approve" method="post">
    <table>
        <tr>
            <th>PID:</th>
            <td><%= pid %></td>
        </tr>
        <tr>
            <th>Title:</th>
            <td><%= title %></td>
        </tr>
        <tr>
            <th>Type:</th>
            <td><%= type %></td>
        </tr>
        <tr>
            <th>Location:</th>
            <td><%= location %></td>
        </tr>
        <tr>
            <th>Description:</th>
            <td><%= description %></td>
        </tr>
        <tr>
            <th>Owner Name:</th>
            <td><%= owner %></td>
        </tr>
        <tr>
            <th>Owner Phone:</th>
            <td><%= phone %></td>
        </tr>
  
        
          <tr>
            <th>Price:</th>
            <td><%= price %></td>
        </tr>
        
        <tr>
            <th>totalcost:</th>
            <td><%= totalcost %></td>
        </tr>
        
        <tr>
            <th>states:</th>
            <td><%= states %></td>
        </tr>
        
        <tr>
            <th>discount:</th>
            <td><%= discount %></td>
        </tr>
    </table>




<input type = "hidden" name="id" value = "<%= pid %>">
<input type = "hidden" name="title" value = "<%= title %>">
<input type = "hidden" name="type" value = "<%= type %>">
<input type = "hidden" name="location" value = "<%= location %>">
<input type = "hidden" name="description" value = "<%= description %>">
<input type = "hidden" name="owner" value = "<%= owner %>">
<input type = "hidden" name="phone" value = "<%= phone %>">

<input type = "hidden" name="price" value = "<%= price %>">
<input type = "hidden" name="totalcost" value = "<%= totalcost %>">
<input type = "hidden" name="states"value = "<%= states %>">
<input type = "hidden" name="discount" value = "<%= discount %>">


<input type = "submit" name="approve" value = "approve">
<input type = "submit" name="disapprove" value = "disapprove">


   <form action="" method="get">
        <button type="button" class="edit" onclick="window.location.href='admin_update_advertistement.jsp?pid=<%= pid %>&type=<%= type %>&title=<%= title %>&phone=<%= phone %>&price=<%= price %>&owner=<%= owner %>&description=<%= description %>&location=<%= location %>&totalcost=<%= totalcost %>&states=<%= states %>&discount=<%= discount%>'">
            Edit
        </button>
        <button type="button" class="delete" onclick="window.location.href='admin_delect_advertistment.jsp?pid=<%= pid %>&type=<%= type %>&title=<%= title %>&phone=<%= phone %>&price=<%= price %>&owner=<%= owner %>&description=<%= description %>&location=<%= location %>&totalcost=<%= totalcost %>&states=<%= states %>&discount=<%= discount%>'">
        delect </button>
</form>
</body>
</html>