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

        //Sipariş nesnesi oluşturma ve Ürün listesini siparişe ekleme
        Order o1=new Order();
        o1.id=1123;
        o1.products=pList;
        o1.bill=b1;

        Order o2=new Order();
        o2.id=1123;
        o2.products=pList;
        o2.bill=b1;

        ArrayList<Order> oList=new ArrayList<>();
        oList.add(o1);
        oList.add(o2);

        Customer c1=new Customer();
        c1.name="Cem";
        c1.id=45689;
        c1.order=oList;

        System.out.println("Müşteri Sayısı :"+c1.count);
        Customer c5=new Customer();
        c5.name="Ali";
        Customer c2=new Customer();
        c2.name="Veli";
        Customer c3=new Customer();
        c3.name="Ahmet";
        Customer c4=new Customer();
        c4.name="Mehmet";
        System.out.println("Müşteri Sayısı :"+c4.count);

        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);


        //İsmi Cem olanların her bir order'ının ürün sayısını bulup toplama
        int count=0;
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).name.equals("Cem")){
                for (int j = 0; j < customers.get(i).order.size(); j++) {
                    count+=customers.get(i).order.get(j).products.size();
                }
            }
        }
        System.out.println("İsmi Cem olan müşterilerin aldıkları ürün sayısı : "+count);
    }
}