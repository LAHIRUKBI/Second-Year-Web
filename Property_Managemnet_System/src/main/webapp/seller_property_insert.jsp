

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>


<%
String phone = request.getParameter("phone");
String name = request.getParameter("name");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Create Property Listing</title>
  <style>
    /* Basic styling for a clean and organized layout */
    body {
      font-family: Arial, sans-serif;
      margin: 20px;
    }
    form {
      display: flex;
      flex-direction: column;
      gap: 10px;
    }
    label {
      display: block;
      margin-bottom: 5px;
    }
    input[type="text"],
    input[type="email"] {
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 4px;
    }
    input[type="submit"] {
      padding: 10px 20px;
      background-color: #4CAF50; /* Green */
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <h1>Create Property Listing</h1>

  <form action="seller_insert" method="post">
  


    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required>

    <label for="type">Property Type:</label>
    <input type="text" id="type" name="type" required>

    <label for="location">Location:</label>
    <input type="text" id="location" name="location" required>

    <label for="description">Description:</label>
    <textarea id="description" name="description" rows="5" required></textarea>

    <label for="owner_name">Owner Name:</label>
    <input type="text" id="owner_name" name="owner_name" value = "<%=name %>" required readonly>

    <label for="owner_phone">Owner Phone Number:</label>
    <input type="tel" id="owner_phone" name="owner_phone" value = "<%=phone%>" readonly >
    

    

    <label for="price">Price:</label>
    <input type="number" id="price" name="price" step="0.01" required> 
    
   
    
      <input type="hidden" name="owner" value = "<%= name %>" readonly >
    
    
     <input type="submit" value="Create Listing">
  </form>
</body>
</html>
