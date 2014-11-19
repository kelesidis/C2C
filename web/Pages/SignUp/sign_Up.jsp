<%-- 
    Document   : Sign_Up
    Created on : Nov 9, 2014, 12:56:14 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WEB_APP_NAME Sign Up</title>
    </head>
    <body>
       <table>
            <form action="SignUpVerification" method="post">
            <tr>
                <td align="right">First Name:</td>
                <td><input type="text" name="suname"></td>
            </tr>
            <tr>
                <td align="right">Surname:</td>
                <td><input type="text" name="susurname"></td>
            </tr>
            <tr>
                <td align="right">Username:</td>
                <td><input type="text" name="suusername"></td>
            </tr>
            <tr>
                <td align="right">Password:</td>
                <td><input type="text" name="supassword"></td>
            </tr>
            <tr>
                <td align="right">Password Confirmation:</td>
                <td><input type="text" name="supasswordconfirmation:"></td>
            </tr>
            <tr>
                <td align="right">E-mail:</td>
                <td><input type="text" name="suemail:"></td>
            </tr>
            <tr>
                <td align="right"> <input type="submit" value="Signup"></td>
            </tr>
            
        </table>
    </body>
</html>
