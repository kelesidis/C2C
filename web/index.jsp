<%-- 
    Document   : index
    Created on : Nov 8, 2014, 5:53:31 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing</title>
    </head>
    <body>
       <table>
            <form action="ControllerServlet" method="post">
            <tr>
                <td align="right">NAME:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td align="right">PASSWORD:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
             <td align="right">Register  <input type="submit" value="login"></td>
            </tr>
             </form> 
        </table>
    </body>
</html>
