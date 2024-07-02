<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%
    // Get property details from request parameters
    String pid = request.getParameter("pid");
    String title = request.getParameter("title");
    String type = request.getParameter("type");
    String location = request.getParameter("location");
    String description = request.getParameter("description");
    String owner = request.getParameter("owner");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
    String price = request.getParameter("price");
    String totalcost = request.getParameter("totalcost");
    String states = request.getParameter("states");
    String discount = request.getParameter("discount");
    
%>

<!DOCTYPE html>
<html>
<head>
    <title>Property Details (PID:<%= pid %>)</title>
    <link rel="stylesheet" href="JY/seller_property_details.css">
    
</head>
<body  style="background-color:red">
    <h2>Property Details (PID:<%= pid %>)</h2>

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

        <button type="button" class="edit" onclick="window.location.href='seller_update_advertistement.jsp?pid=<%= pid %>&type=<%= type %>&title=<%= title %>&email=<%= email %>&phone=<%= phone %>&price=<%= price %>&owner=<%= owner %>&description=<%= description %>&location=<%= location %>&totalcost=<%= totalcost %>&states=<%= states %>&discount=<%= discount%>'">
            Edit
        </button>
        <button type="button" class="delete" onclick="window.location.href='delect_advertistment.jsp?pid=<%= pid %>&type=<%= type %>&title=<%= title %>&email=<%= email %>&phone=<%= phone %>&price=<%= price %>&owner=<%= owner %>&description=<%= description %>&location=<%= location %>&totalcost=<%= totalcost %>&states=<%= states %>&discount=<%= discount%>'">
        delete </button>
        
        
