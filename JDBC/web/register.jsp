
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form </title>
    </head>
    
    <body>
        <h2> Register Here </h2>
        
        <form action="registerServlet" method="post">
            <table border="1" style ="width : 50%">
                <tr> 
                    <td>Enter Name</td>
                    <td><input type="text" name="name" required/></td>
                </tr>
                <tr> 
                    <td>Enter Age</td>
                    <td><input type="number" name="age" required/></td>
                </tr>
                <tr>
                    <td>Select Gender</td>
                    <td>
                        <input type="radio" name="gender" value="Male" checked/>Male
                        <input type="radio" name="gender" value="Female" checked/>Female
                    </td>
                </tr>
                <tr> 
                    <td>Enter City</td>
                    <td><input type="text" name="city" required/></td>
                </tr>
                <tr> 
                    <td>Enter Email</td>
                    <td><input type="email" name="email" required/></td>
                </tr>
                <tr>
                    <td>Enter Password</td>
                    <td><input type="password" name="password" required/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Register"/>
                    </td>
                </tr>
            </table>
        </form>
        
        <a href="index.html">Click Here for Login! </a>
        
    </body>
</html>
