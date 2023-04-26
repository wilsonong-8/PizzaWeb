package newpackage;

public class Customer 
{
  int id;
  String  user;
  String  pass;
  String  fname;
  String  lname;
  String  email;
  String  address;
  String  country;
  
  public Customer()
  {
      
  }
  
  public Customer(int id, String user, String pass, String fname, String lname, String email, String address, String country)
  {
      this.id = id;
      this.user = user;
      this.pass = pass;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.address = address;
      this.country = country;
  }
  
  public Customer(String user, String pass, String fname, String lname, String email, String address, String country)
  {
      
      this.user = user;
      this.pass = pass;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.address = address;
      this.country = country;
  }
  
  public Customer(String user, String pass)
  {      
      this.user = user;
      this.pass = pass; 
  }
  
  public int getId()
  {
      return id;
  }
  
  public void setId(int id)
  {
      this.id = id;
  }
  
  public String getUser()
  {
      return user;
  }
  
  public void setUser(String user)
  {
      this.user = user;
  }
  
  public String getPass()
  {
      return pass;
  }
  
  public void setPass(String pass)
  {
      this.pass = pass;
  }
  
  public String getFname()
  {
      return fname;
  }
  
  public void setFname(String fname)
  {
      this.fname = fname;
  }
  
  public String getLname()
  {
      return lname;
  }
  
  public void setLname(String lname)
  {
      this.lname= lname;
  }
  
  public String getEmail()
  {
      return email;
  }
  
  public void setEmail(String email)
  {
      this.email = email;
  }
  
  public String getAddress()
  {
      return address;
  }
  
  public void setAddress(String address)
  {
      this.address = address;
  }
  
  public String getCountry()
  {
      return country;
  }
  
  public void setCountry(String country)
  {
      this.country = country;
  }
  
}
