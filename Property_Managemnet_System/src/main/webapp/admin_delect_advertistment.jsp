<%@ page language="java" contentType="text/html; charset=UTF-8" %>
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
    <title>Confirm Delete Advertisement (PID:<%= pid %>)</title>
    <style>
        body {
            font-family: Arial, sans-serif; /* Clean and modern font */
            margin: 0; /* Remove default margin */
            padding: 20px; /* Add some padding for aesthetics */
        }

        h2 {
            text-align: center; /* Center the confirmation heading */
            margin-bottom: 20px; /* Add some space below the heading */
        }

        table {
            border-collapse: collapse; /* Ensure table cells collapse properly */
            width: 100%; /* Make the table span the full width */
            margin-bottom: 20px; /* Add spacing below the table */
        }

        th, td {
            padding: 10px; /* Add padding for readability */
            border: 1px solid #ddd; /* Create a light border for separation */
            text-align: left; /* Align text to the left */
        }

        th {
            background-color: #f2f2f2; /* Subtle background color for headers */
            font-weight: bold; /* Make headers stand out */
        }

        form {
            text-align: center; /* Center the form buttons */
        }

        button {
            margin: 5px; /* Add some space between buttons */
            padding: 10px 20px; /* Adjust button size and padding */
            border: none; /* Remove default button border */
            border-radius: 5px; /* Add rounded corners for aesthetics */
            cursor: pointer; /* Provide visual feedback for clickable buttons */
        }

        .confirm {
            background-color: #3498db; /* Blue for confirmation */
            color: white; /* White text for contrast */
        }

        .cancel {
            background-color: #e74c3c; /* Red for cancellation */
            color: white; /* White text for contrast */
        }
    </style>
</head>
<body>
    <h2>Confirm Delete Advertisement (PID:<%= pid %>)</h2>

    <p>Are you sure you want to delete the following advertisement?</p>

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
            <th>Owner Email:</th>
            <td><%= email %></td>
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

    <form action="delect_ad" method="post">
        <input type="hidden" name="pid" value="<%= pid %>">
        <input type="hidden" name="owner" value="<%= owner %>">
        <input type="hidden" name="phone" value="<%= phone %>">
        
        <button type="submit" class="confirm">Confirm Delete</button>
        <button type="button" class="cancel" onclick="window.location.href='seller_advertistments.jsp'">Cancel</button>
    </form>

</body>
</html>
