<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="newpackage.Customer"%>

<% Customer customer = (Customer) session.getAttribute("loginUser");
    if(customer==null){
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Menu Page</title>
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
        td
        {
            font-weight: bold;
            text-align: center;
            border: 3px ridge rgb(243, 243, 232);
            background: rgb(243, 243, 232);
            width: 330px;
            padding: 3px;
        }
        h3
        {
            margin:0;
            padding:0;
        }
        img
        {
            width: 300px;
        }
        #title
        {
            font-weight: bold;
            font-size: 50px;
        }
        #loginInfo
        {
            float:right;
            border: 3px ridge rgb(243, 243, 232);
            background: rgb(243, 243, 232);  
        }
        #trolley
        {
            width: 30px;
        }
        

        </style>
    </head>
    <body>
        <div id="loginInfo">
        <h3> Welcome, <%= customer.getUser() %>  </h3>
        <h3>ID: <%= customer.getId() %> </h3>
        <h3>Email: <%= customer.getEmail() %> </h3>
        <center>
            <form name="orderCartForm" action="OrderCartServlet" method="POST">
                <input type="image" id="trolley" src="Images/trolley.png" value="Order Cart" name="orderCarButton"/>
            </form>
        <button id="logout"><a href="LogoutServlet">Log Out</a></button>
        </center>
        </div>
        
    <center>
        <h1 id="title">Pizza Menu</h1>
        <table>
            <tbody>
                <tr>
                    <td><img src="Images/classicpepperoni.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Classic Pepperoni</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Classic Pepperoni" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />
                        </form>
                    </td>
                    <td>
                        <img src="Images/classychic2.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Classic Chicken</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Classic Chicken" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />   
                        </form>
                    </td>
                    <td>
                        <img src="Images/hawaiian.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Hawaiian Pizza</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Hawaiian Pizza" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="Images/meatasaurus.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Meat-O-Lover</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Meat-O-Lover" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                        
                    </td>
                    <td>
                        <img src="Images/prawnsensation.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Seafood Pizza</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Seafood Pizza" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                    </td>
                    <td>
                        <img src="Images/quattro-fiesta.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Four Flavor Lover</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Four Flavor Lover" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="Images/romanomargherita.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                             <span>Margherita</span>
                             <input type="hidden" name="username" value="<%= customer.getUser() %>">
                             <input type="hidden" name="pizzaname" value="Margherita" />
                            <select name="choosesize">
                               <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                           </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                    </td>
                    <td>
                        <img src="Images/simplycheese2.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>Just Cheese</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="Just Cheese" />
                        <select name="choosesize">
                            <option value="Small">Small: $15</option>
                            <option value="Medium">Medium: $20</option>
                            <option value="Large">Large: $30</option>
                        </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" /> 
                        </form> 
                    </td>
                    <td>
                        <img src="Images/thebigbbq2.jpg" alt=""/>
                        <form name="addorder" action="PizzaOrderServlet" method="POST">
                            <span>BBQ Chicken</span>
                            <input type="hidden" name="username" value="<%= customer.getUser() %>">
                            <input type="hidden" name="pizzaname" value="BBQ Chicken" />
                            <select name="choosesize">
                                <option value="Small">Small: $15</option>
                                <option value="Medium">Medium: $20</option>
                                <option value="Large">Large: $30</option>
                            </select>
                        <input type="submit" value="Add to Order" name="addorderbutton" />  
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </center>
    </body>
</html>
