package newpackage;

public class Pizza {
    int pizzaId;
    String username;
    String pizza_name;
    String size;
    int price;
    
    public Pizza() {
        
    }
    
    public Pizza(int pizzaId,String username, String pizza_name, String size,int price) {
        this.pizzaId = pizzaId;
        this.username = username;
        this.pizza_name = pizza_name;
        this.size = size;
        this.price = price;
    }
    
    public Pizza(String username, String pizza_name, String size,int price) {
        this.username = username;
        this.pizza_name = pizza_name;
        this.size = size;
        this.price = price;
    }
    
    
    public int getPizzaId() {
        return pizzaId;
    }
    
    public String getUserName() {
        return username;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    public String getPizzaName() {
        return pizza_name;
    }
    
    public void setPizzaName(String pizza_name) {
        this.pizza_name = pizza_name;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public int getPrice() {
        return this.price;
    }
   
}
