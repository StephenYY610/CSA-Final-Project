import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Stock{
    public Double price;
    public ArrayList<String> colors = new ArrayList<String>();
    public List<String> colorList = Arrays.asList("blue", "red", "orange", "yellow", "green", "purple", "pink", "aqua", "black", "white", "gray");
    public String Color;
    public String name;
    public ArrayList<String> brands = new ArrayList<String>();
    public List<String> brandList = Arrays.asList("Lenovo", "Asus", "Razer", "Alienware", "Apple", "Dell");
    public String Brand;

    public Stock(String n, int c, int b, double p){
        colors.addAll(colorList);
        brands.addAll(brandList);
        this.name = n;
        this.Color= colors.get(c);
        this.Brand= brands.get(b);
        this.price = p;
    }

    public double getPrice(){
        return price;
    }
    public String getColor(){
        return Color;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return Brand;
    }

     @Override
    public String toString() {
        return name + " (Brand: " + Brand + ", Color: " + Color + ", Price: $" + price + ")";
    }

    public void setPrice(double p){
        price=p;
    }
    public void setColor(int c){
        Color=colors.get(c);
    }
    public void setName(String n){
        name=n;
    }
    public void setBrand(int b){
        Brand=brands.get(b);
    }
    
}