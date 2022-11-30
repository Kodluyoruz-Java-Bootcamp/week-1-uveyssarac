import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int billPrice;
        Product p1=new Product("Ekmek","Gıda",5,50);
        Product p2=new Product("Peynir","Gıda",45,25);
        Product p3=new Product("Zeytin","Gıda",50,20);
        Product p4=new Product("Çorap","Tekstil",15,100);
        Product p5=new Product("Çay","Gıda",5,50);
        Product p6=new Product("Telefon","Teknolojik",2205,50);
        Product p7=new Product("Akıllı Saat","Teknolojik",501,50);

        // ÜRÜN LİSTESİ OLUŞTURMA VE FATURALARINI OLUŞTURMA
        ArrayList<Product> pList=new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);
        billPrice=p1.price+ p2.price+ p3.price+ p4.price;
        Bill b1=new Bill(billPrice,2358);

        ArrayList<Product> pList2=new ArrayList<>();
        pList2.add(p6);
        pList2.add(p7);
        billPrice=p6.price+ p7.price;
        Bill b2=new Bill(billPrice,1238);


        ArrayList<Product> pList3=new ArrayList<>();
        pList3.add(p7);
        pList3.add(p7);
        pList3.add(p7);
        billPrice=p7.price+ p7.price+ p7.price;
        Bill b3=new Bill(billPrice,158);

        //Sipariş nesnesi oluşturma ve Sipariş listelerine siparişe ekleme
        Order o1=new Order(1123,pList,b1);
        Order o2=new Order(1459,pList2,b2);
        Order o3=new Order(1789,pList3,b3);

        //SİPARİŞ LİSTESİ OLUŞTURMA
        ArrayList<Order> oList1=new ArrayList<>();
        oList1.add(o1);
        oList1.add(o2);

        ArrayList<Order> oList2=new ArrayList<>();
        oList2.add(o2);
        oList2.add(o3);

        ArrayList<Order> oList3=new ArrayList<>();
        oList3.add(o3);

        //SİPARİŞİ OLAN MÜŞTERİLER OLUŞTURMA
        Customer c1=new Customer(11,"Cem",26,oList1);
        Customer c6=new Customer(22,"Cem",23,oList2);
        Customer c7=new Customer(33,"Berkecan",17,oList3);


        // NÜŞTERİ NESNELERİ OLUŞTURMA VE OLUŞTURULAN MÜŞTERİ SAYISI KONTROLÜ
        System.out.println("Müşteri Sayısı :"+c1.count);

        Customer c5=new Customer(31,"Ali",31);
        Customer c2=new Customer(44,"Veli",24);
        Customer c3=new Customer(49,"Ahmet",27);
        Customer c4=new Customer(66,"Mehmet",30);

        System.out.println("Müşteri Sayısı :"+c1.count);

        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        customers.add(c7);


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

        System.out.println("Sistemdeki 1500 TL üzerindeki faturalar");
        //Sistemdeki 1500 TL üzerindeki faturalar
        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < customers.get(i).order.size(); j++) {
                if(customers.get(i).order.get(j).bill.price>1500){
                    System.out.print("Customer id : "+customers.get(i).id+" |");
                    System.out.println(" Bill amount : "+customers.get(i).order.get(j).bill.price+" |");
                }
            }
        }

    }
}