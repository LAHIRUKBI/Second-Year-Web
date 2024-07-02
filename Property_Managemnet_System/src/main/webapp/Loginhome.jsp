<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginHome</title>
<link rel="stylesheet" href="CSS/NavigationBar.css">
<link rel="stylesheet" href="CSS/Loginhome.css">
<link rel="stylesheet" href="CSS/footer.css">
</head>
<body style="background-color:#D5F1E7">


<!--Create Navigation bar-->
<ul class="menu">
     <li class="menu"><a href="Home.jsp" target="_top">HOME</a></li>
     <li class="menu"><a href="useraccount.jsp" target="_top">PROPERTY</a></li>
     <li class="menu"><a href="Loginhome.jsp" target="_top">LOGIN</a></li>
	 <li class="menu"><a href="Contact.jsp"target="_top">CONTACT US</a></li>


	 <li class="licl"><a href="Loginhome.jsp" target="_top"><img src="images/log.png" width="30px" height="30px"></a></li> 
	 <div class="searchbox">
         <form> 
              <input type="text" placeholder=" Search...." name="search" style="margin-left:800px;  border-radius: 10px; background-color: E4F1FF;transition: background-color 0.9s ease;"> 
              <button type="submit" style="color:white;">Search</button> 
         </form>
     </div>
</ul>




<center>
      <h1>SELECT ACCOUNT TYPE</h1><br>
      <p style="font-size: 20px;color: #3A24F6;margin-bottom: 20px;">Login to access your account and explore personalized features tailored to your role.</p>
</center><br><br><br>



<div class="container">
   <div class="left-sentence">
       <b>CUSTOMER</b><br><br>
       <img src="images/User.png" width="40%" height="50%"><br><br>
       <a href="login.jsp"><button class="Faddbutton" >LOGIN</button></a>           
   </div>
  
  
  
    
   <div class="right-sentence">
       <b>SELLER</b><br><br>
       <img src="images/User.png" width="40%" height="50%"><br><br>
       <a href="seller_login.jsp"><button class="Faddbutton" >LOGIN</button></a>
   </div>
   
   
    
                                                                            
   <div class="right-sentence">
       <b>SUPERVISOR</b><br><br>
       <img src="images/User.png" width="40%" height="50%"><br><br>
       <a href="SupLOGIN.jsp"><button class="Faddbutton" >LOGIN</button></a>
   </div>
  
  
  
   <div class="right-sentence">
       <b>ADMINISTER</b><br><br>
       <img src="images/User.png" width="40%" height="50%"><br><br>
       <a href="admin_login.jsp"><button class="Faddbutton" >LOGIN</button></a>
   </div>
   
</div><br><br>







<footer class="footer">
  <div class="footer-content">
    <div class="social-media">
      <a href="https://www.facebook.com"><i class="fab fa-facebook-f"></i></a>
      <a href="mailto:info@example.com"><i class="far fa-envelope"></i></a>
      <a href="https://www.instagram.com"><i class="fab fa-instagram"></i></a>
    </div>
    <div class="contact-info">
      <p>Contact Us: (+94)71 091 0202</p>
    </div>
    <br><br><br><br>
    <div class="developer-team">
      <p>Developed by Team SLIIT</p>
    </div>
  </div>
</footer>








</body>
</html>