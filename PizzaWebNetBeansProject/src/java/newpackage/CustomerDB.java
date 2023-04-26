package newpackage;
import java.sql.*;

public class CustomerDB 
{
    Connection  con;
    
    public CustomerDB (Connection con)
    {
        this.con = con;
    }
    
    public boolean saveCustomer(Customer customer)
    {
        boolean set = false;
        try
        {
            //insert data from the customer registration form
            String  query = "insert into customer(username, password, firstname,lastname, email, address, country) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, customer.getUser());
            pt.setString(2, customer.getPass());
            pt.setString(3, customer.getFname());
            pt.setString(4, customer.getLname());
            pt.setString(5, customer.getEmail());
            pt.setString(6, customer.getAddress());
            pt.setString(7, customer.getCountry());
            
            pt.executeUpdate();
            set = true;
        
        }
        catch (SQLException e)
        {
        }
        return set;
    }
    
    //to validate login details
    public Customer login(String user, String pass)
    {
        Customer usr = null;
        try
        {
            String query ="select * from customer where username=? and  password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, pass);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
             usr = new Customer();
             usr.setId(rs.getInt("id"));
             usr.setUser(rs.getString("username"));
             usr.setPass(rs.getString("password"));
             usr.setFname(rs.getString("firstname"));
             usr.setLname(rs.getString("lastname"));
             usr.setEmail(rs.getString("email"));
             usr.setAddress(rs.getString("address"));
             usr.setCountry(rs.getString("country"));
            }
        }
        catch(SQLException e)
        {
            
        }
        return usr;
    }
    
}

