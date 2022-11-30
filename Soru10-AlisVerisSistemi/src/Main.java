import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product p1=new Product("Ekmek","Gıda",5,50);
        Product p2=new Product("Peynir","Gıda",45,25);
        Product p3=new Product("Zeytin","Gıda",50,20);
        Product p4=new Product("Çorap","Tekstil",15,100);
        Product p5=new Product("Çay","Gıda",5,50);

        ArrayList<Product> pList=new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);

        Bill b1=new Bill();
        b1.price=p1.price+ p2.price+ p3.price+ p4.price;

        Order o1=new Order();
        o1.id=1123;
        o1.products=pList;
        o1.bill=b1;

        ArrayList<Order> oList=new ArrayList<>();
        oList.add(o1);
        Customer c1=new Customer();
        c1.name="Cem";
        c1.id=45689;
        c1.order=oList;

        System.out.println("Müşteri Sayısı :"+c1.count);
        Customer c5=new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        Customer c4=new Customer();
        System.out.println("Müşteri Sayısı :"+c4.count);



    }
}