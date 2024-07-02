<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="CSS/NavigationBar.css">
    <link rel="stylesheet" href="JY/seller_login.css">  </head>
<body>




<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>
     <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 
</ul>





    <div class="login-container"> <h1>Admin Login</h1>
    <center><img src="images/Supervisor.png" width="200px" height="200px" alt="Login Icon"><br>
        <form action="log" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" placeholder="Enter your username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" placeholder="Enter your password" required>
            </div>
            <button type="submit" name="login" value="login">Login</button>
        </form>
    </div>
</body>
</html>
