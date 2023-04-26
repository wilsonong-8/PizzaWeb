package newpackage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDB {
    
    Connection con;
    
    public PizzaDB(Connection con) {
        this.con = con;
    }
    
    public boolean savePizza(Pizza pizza) {
        boolean set = false;
        try
        {
            String query = "insert into ordercart(username, pizza_name, size, price) values(?,?,?,?)";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1,pizza.getUserName());
            pt.setString(2, pizza.getPizzaName());
            pt.setString(3, pizza.getSize());
            pt.setInt(4,pizza.getPrice());
            
            pt.executeUpdate();
            set = true;
        }
        catch(SQLException e) 
        {    
        }
        return set;
    }
    
    public List<Pizza> getOrderCart(String user) {
        List<Pizza> orderCart = new ArrayList();
        
        try{
            String query = "select * from ordercart where username=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1,user);
            
            ResultSet rs = pt.executeQuery();
            while(rs.next()) {
                int pizzaId = rs.getInt("pizza_id");
                String username = rs.getString("username");
                String pizza_name = rs.getString("pizza_name");
                String size = rs.getString("size");
                int price = rs.getInt("price");
                
                Pizza tempPizza = new Pizza(pizzaId,username,pizza_name,size,price);
                orderCart.add(tempPizza);
            }
        }
        catch(SQLException e) {
        }
        return orderCart;
    }
    
    public boolean deleteOrder(int pizzaId) {
        try{
            String query = "delete from ordercart where pizza_id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, pizzaId);
            
            pt.executeUpdate();  
        }
        catch(SQLException e) {
            return false;
        }
        return true;
    }
    
    public boolean deleteOrder(String username) {
        try{
            String query = "delete from ordercart where username=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, username);
            
            pt.executeUpdate();  
        }
        catch(SQLException e) {
            return false;
        }
        return true;
    }
    
}
