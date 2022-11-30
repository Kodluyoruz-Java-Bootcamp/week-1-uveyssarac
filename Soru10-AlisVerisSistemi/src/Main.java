import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product p1=new Product("Ekmek","Gıda",5,50);
        Product p2=new Product("Peynir","Gıda",45,25);
        Product p3=new Product("Zeytin","Gıda",50,20);
        Product p4=new Product("Çorap","Tekstil",15,100);
        Product p5=new Product("Çay","Gıda",5,50);
        Product p6=new Product("Telefon","Teknolojik",2205,50);
        Product p7=new Product("Akıllı Saat","Teknolojik",501,50);

        ArrayList<Product> pList=new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);

        Bill b1=new Bill();
        b1.price=p1.price+ p2.price+ p3.price+ p4.price;
        b1.id=2358;


        ArrayList<Product> pList2=new ArrayList<>();
        pList2.add(p6);
        pList2.add(p7);

        Bill b2=new Bill();
        b2.price=p6.price+ p7.price;
        b2.id=1238;

        ArrayList<Product> pList3=new ArrayList<>();
        pList3.add(p7);
        pList3.add(p7);
        pList3.add(p7);

        Bill b3=new Bill();
        b3.price=p7.price+ p7.price+ p7.price;
        b3.id=158;


        //Sipariş nesnesi oluşturma ve Ürün listesini siparişe ekleme
        Order o1=new Order();
        o1.id=1123;
        o1.products=pList;
        o1.bill=b1;

        Order o2=new Order();
        o2.id=1123;
        o2.products=pList;
        o2.bill=b1;

        Order o3=new Order();
        o3.id=1123;
        o3.products=pList2;
        o3.bill=b2;

        Order o4=new Order();
        o4.id=1123;
        o4.products=pList3;
        o4.bill=b3;

        ArrayList<Order> oList=new ArrayList<>();
        oList.add(o1);
        oList.add(o2);

        ArrayList<Order> oList2=new ArrayList<>();
        oList.add(o2);
        oList.add(o3);
        oList.add(o4);

        Customer c1=new Customer();
        c1.name="Cem";
        c1.id=45689;
        c1.age=26;
        c1.order=oList;

        Customer c6=new Customer();
        c6.name="Cem";
        c6.id=45671;
        c6.age=23;
        c6.order=oList;

        Customer c7=new Customer();
        c6.name="Berkecan";
        c6.id=45991;
        c6.age=17;
        c6.order=oList;


        System.out.println("Müşteri Sayısı :"+c1.count);
        Customer c5=new Customer();
        c5.name="Ali";
        c5.age=31;
        Customer c2=new Customer();
        c2.name="Veli";
        c2.age=24;
        Customer c3=new Customer();
        c3.name="Ahmet";
        c3.age=27;
        Customer c4=new Customer();
        c4.name="Mehmet";
        c4.age=30;
        System.out.println("Müşteri Sayısı :"+c1.count);

        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);


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

        //İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı

        int price=0;
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).name.equals("Cem")){
                if(customers.get(i).age>25 && customers.get(i).age<30){
                    for (int j = 0; j < customers.get(i).order.size(); j++) {
                        price+= customers.get(i).order.get(j).bill.price;
                    }

                }
            }
        }
        System.out.println("İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı : "+price);
    }
}