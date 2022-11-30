import java.util.ArrayList;

public class Customer {
    int id;
    String name;
    int age;
    static int count=0;

    Customer(){
        count++;
    }
    ArrayList<Order>order=new ArrayList<Order>();
}
