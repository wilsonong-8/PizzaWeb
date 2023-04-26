<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
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
            div
            {
                position: relative;
                top: 150px;
                background: rgb(243, 243, 232);
                width: 350px;
                border: 8px ridge rgb(25, 151, 80);
            }
            #homeImage
            {   
                width: 250px;
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
        <h1 id="title">Log In to Order</h1>
        <form name="login" method="POST" action="LoginServlet">
            <table border="0" cellspacing="10">
   
                <tbody>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="user" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Clear" /></td>
                    </tr>
                    <tr>
                        <td>No account yet?</td>
                        <td><a href="RegistrationPage.jsp">Sign Up now</a></td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        </div>
             
    </center>
    </body>
</html>
