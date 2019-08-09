package chainofresponsibility;

public class Order {
    
    private String customer;
    private double price;
    
    public Order(String customer, double price) {
        this.customer = customer;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return customer + " " + price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public String getCustomer() {
        return customer;
    }
    
    

}
