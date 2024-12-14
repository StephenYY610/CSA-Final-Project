import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private int ID;
    private int password;
    private double deposit;
    private List<Stock> purchasedItems = new ArrayList<Stock>();

    public Customer(String n, int id, int pw, double dp){
        name=n;
        ID=id;
        password=pw;
        deposit=dp;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public int getPassword(){
        return password;
    }
    public double getDeposit(){
        return deposit;
    }
    public void buy(Stock product) {
        if (deposit >= product.getPrice()) {
            deposit -= product.getPrice();
            purchasedItems.add(product);
            System.out.println("Purchase successfully: " + product.getName());
        } else {
            System.out.println("Not enough money to buy: " + product.getName());
        }
    }
    public List<Stock> getPurchasedItems() {
        return purchasedItems;
    }
    public void printPurchasedItems() {
        System.out.println("Items purchased by " + name + ":");
        for (Stock item : purchasedItems) {
            System.out.println("- " + item);
        }
    }

}
