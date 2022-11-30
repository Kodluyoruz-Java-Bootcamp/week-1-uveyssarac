import java.util.ArrayList;

public class Order {
    int id;
    ArrayList<Product> products=new ArrayList<Product>();
    Bill bill;

    public Order(int id, ArrayList<Product> products, Bill bill) {
        this.id = id;
        this.products = products;
        this.bill = bill;
    }
}
