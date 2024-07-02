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
    String price = request.getParameter("price");
    String Totalcost = request.getParameter("totalcost");
    String States = request.getParameter("states");
    String Discount = request.getParameter("discount");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Advertisement (PID:<%= pid %>)</title>
    <style>
        body {
            font-family: Arial, sans-serif; /* Clean and modern font */
            margin: 0; /* Remove default margin */
            padding: 20px; /* Add some padding for aesthetics */
        }

        h2 {
            text-align: center; /* Center the edit advertisement heading */
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
        }

        th {
            background-color: #f2f2f2; /* Subtle background color for headers */
            font-weight: bold; /* Make headers stand out */
            text-align: left; /* Align left for labels */
        }

        td:first-child {
            width: 20%; /* Fix label column width */
        }

        input[type="text"], textarea {
            width: 100%; /* Make input fields fill the remaining width */
            padding: 5px; /* Add padding for better user experience */
            border: 1px solid #ccc; /* Create a light border */
        }

        form {
            text-align: center; /* Center the submit button */
        }

        button {
            padding: 10px 20px; /* Adjust button size and padding */
            border: none; /* Remove default button border */
            border-radius: 5px; /* Add rounded corners for aesthetics */
            cursor: pointer; /* Provide visual feedback for clickable buttons */
        }
    </style>
</head>
<body>
    <h2>Edit Advertisement (PID:<%= pid %>)</h2>

    <form action="seller_update_ad" method="post">
        <input type="hidden" name="pid" value="<%= pid %>">
        <table>
            <tr>
                <th>PID:</th>
                <td><%= pid %></td>
                <input type="hidden" name="pid" value="<%= pid %>" required>
            </tr>
            
            <tr>
                <th>Title:</th>
                <td><input type="text" name="title" value="<%= title %>" required></td>
            </tr>
            
            <tr>
                <th>Type:</th>
                <td><input type="text" name="type" value="<%= type %>" required></td>
            </tr>
            
            <tr>
                <th>Location:</th>
                <td><input type="text" name="location" value="<%= location %>" required></td>
            </tr>
            
            <tr>
                <th>Description:</th>
                <td><textarea name="description" required><%= description %></textarea></td>
            </tr>
            
            <tr>
                <th>Owner Name:</th>
                <td><input type="text" name="owner" value="<%= owner %>" required></td>
            </tr>
            
            <tr>
                <th>Owner Phone:</th>
                <td><input type="text" name="phone" value="<%= phone %>" readonly></td>
            </tr>
          
            <tr>
                <th>Price:</th>
                <td><input type="text" name="price" value="<%= price %>" required></td>
            </tr>
            
             <tr>
                <th>Totalcost:</th>
                <td><input type="text" name="Totalcost" value="<%= Totalcost %>" readonly></td>
            </tr>
            
             <tr>
                <th>States:</th>
                <td><input type="text" name="States"  value="<%= States %>" required></td>
            </tr>
            
             <tr>
                <th>Discount:</th>
                <td><input type="text" name="States" value="<%= Discount %>" readonly></td>
            </tr>
            
            
        </table>
        <button type="submit">Update Advertisement</button>
    </form>
</body>
