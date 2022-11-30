import java.util.ArrayList;

public class Customer {
    int id;
    String name;
    int age;
    static int count=0;
    ArrayList<Order>order=new ArrayList<Order>();

    public Customer(int id, String name, int age, ArrayList<Order> order) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.order = order;
        count++;
    }

    public Customer(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age= age;
        count++;
    }
}
