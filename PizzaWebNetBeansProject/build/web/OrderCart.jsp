<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="newpackage.Customer"%>
<%@page import="java.util.List"%>
<%@page import="newpackage.Pizza"%>

<% Customer customer = (Customer) session.getAttribute("loginUser");
    if(customer==null){
        response.sendRedirect("index.jsp");
    }
%>
<%
    List<Pizza> orderCart = (List<Pizza>)session.getAttribute("ordercart");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Cart</title>
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
        #loginInfo
        {
            float:right;
            border: 3px ridge rgb(243, 243, 232);
            background: rgb(243, 243, 232); 
        }
        h3
        {
            margin:0;
            padding:0;
        }
        #title
        {
            font-weight: bold;
            font-size: 50px;
            
        }
        table
        {
            border: 5px dashed grey;
            background: rgb(243, 243, 232);
            width: 450px;
            text-align: center;
            font-size:18px;
            padding:10px;

        }
        td
        {
            padding:5px;
        }
        #cancel
        {
            color: red;
        }
        #confirmbutton
        {
            color:green;
            font-size:20px;
            font-weight: bold;
        }
        #backbutton
        {
            font-size:18px;
        }
        </style>
    </head>
    
    <body>
        <div id="loginInfo">
        <h3> Welcome, <%= customer.getUser() %>  </h3>
        <h3>ID: <%= customer.getId() %> </h3>
        <h3>Email: <%= customer.getEmail() %> </h3>
        <center>
        <button id="logout"><a href="LogoutServlet">Log Out</a></button>
        </center>
        </div>
    <center>
        <h1 id="title">Order Cart</h1>
        
        <table>
            <tr>
                <th>Pizza</th>
                <th>Size</th>
                <th>Price</th>
            </tr>
            <% int totalPrice = 0; %>
            <% for(Pizza pizza: orderCart) {%>
            <% totalPrice += pizza.getPrice();%>
                    <tr>
                    <td> <%= pizza.getPizzaName() %> </td>
                    <td> <%= pizza.getSize() %> </td>
                    <td> $<%= pizza.getPrice() %> </td>
                    <td><form name="deleteorder" action="DeletePizzaServlet" method="POST">
                        <input type="hidden" name="pizzaid" value="<%= pizza.getPizzaId()%>">       
                        <input id="cancel" type="submit" value="X" name="cancelorderbutton" />  
                        </form>
                    </td>
                    </tr>
                   <% }%>
                   <tr>
                       <td> </td>
                       <td>Total price: </td>
                       <td>$<%= totalPrice %> </td>
                       
                   </tr>
                   <tr>
                       <td> </td>
                       <td colspan="2"><form name="confirmorder" action="ConfirmOrderServlet" method="POST">      
                        <input id="confirmbutton" type="submit" value="Confirm Order" name="cancelorderbutton" />  
                        </form>
                    </td>
                   </tr>
        </table>
                       <br>
                       <input id="backbutton" type="button" value="Back to Order Menu" onclick="location.href='OrderMenu.jsp';" />
        
        
    </center>
    </body>
</html>
