<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <style>
            body
            {
                background-image: url("Images/background image.jpg");
                background-size: cover;
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-position: center;
                color: rgb(25, 151, 80);
            }
            #homeImage
            {   
                width: 150px;
            }
            div
            {
                position: relative;
                top: 150px;
                background: rgb(243, 243, 232);
                width: 400px;
                border: 8px ridge rgb(25, 151, 80);
            }
            #title
            {
                font-family:monospace;

            }
        </style>
    </head>
    <body>
    <center>
        <div>
        <img src="Images/pizza boy image.png" alt="" id="homeImage"/>
        <h1 id="title">User Registration Form</h1>
        <form name="registration" method="POST" action="RegistrationServlet">
            <table border="0" cellspacing="20">
                <tbody>
                    <tr>
                        <td rowspan="8"> <img src="images/registerUser.jpg" alt=""/> </td>
                        <td>User Name:</td>
                        <td><input type="text" name="user" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="first" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="last" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email Address:</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="address" value="" /></td>
                    </tr>
                    <tr>
                        <td>Country:</td>
                        <td><select name="country">
                                <option>Singapore</option>
                                <option>Canada</option>
                                <option>United States</option>
                                <option>United Kingdom</option>
                                <option>Australia</option>
                                <option>Malaysia</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" /></td>
                        <td><a href="index.jsp">Already have account?</a></td>
                    </tr>
                </tbody>
            </table>

            
        </form>
         </div>
        </center>
    </body>
</html>
