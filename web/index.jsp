<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
	  <link rel='stylesheet' type='text/css' href='index-desine.css'/>
		
    </head>
	
    <body class='login-location'>
	
	
	<hr />
	<h2> ~ Welcome ~ </h2>
	<hr />
	<div id='logindiv' align='center'>
       <table >
            <form action="Login" method="post">
            <tr>
                <td align="right"> <i> Username </i> </td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td align="right"> <i>Password</i> </td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td align="center">   </td>
                <td> <form action="SignUp" method="post"> 
                        <input type="submit" value="Login"> 
                        <input type="submit" value="Register"> 
                    
                </td>
            </tr>
            </form>
        </table>
	</div>
    </body>
    
    
</html>
