<%@page import="model.RegUser"%>  
  
<p>You are successfully created an account in this NAMELESS_FOR_NOW_WEB_APP in!</p>  
<%  
RegUser bean=(RegUser)request.getAttribute("bean");  
out.print("Welcome, "+bean.getFirstName());  
out.print("Your surname is : "+bean.getSurnamename());
out.print("Your Username is :"+bean.getUsername());
out.print("Your Email is :"+bean.getEmail());
%> 
