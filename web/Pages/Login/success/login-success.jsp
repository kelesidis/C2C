<%@page import="model.LoginBean"%>  
  
<html>
        <head>
            <style>
                body{background-color:#d0e4fe;} 
            </style>
            <title> Login Error !</title>
            <link rel='stylesheet' type='text/css' href='/Pages/Login/error/login-error.css'/>
        </head>
    <body>
        
        <p style="color:darkgreen;"> <b> You are successfully logged in ! </b> </p>
        
    </body>
</html>
 
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName()+" :) !");  
%> 