import java.util.ArrayList;

public class Customer {
    int id;
    String name;
    static int count=0;

    Customer(){
        count++;
    }
    ArrayList<Order>order=new ArrayList<Order>();
}
