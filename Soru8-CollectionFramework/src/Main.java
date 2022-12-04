import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set -> Unique değerler tutan liste
        //HashSet | TreeSet
        //TreeSet -> Verileri sıralı şekilde tutar harf yada sayı sırasına göre
        //HashSet -> Verileri sırasız tutar
        //LinkedHashSet ->Verileri eklenme sırasına göre tutar
        TreeSet treeset= new TreeSet<String>();
        treeset.add("eski");
        treeset.add("yeni");
        treeset.add("yeni");
        treeset.add("aaaa");
        System.out.println("Liste boş mu? "+treeset.isEmpty()); // .isEmpty -> içinin boş olup olmadığını kontol eder

        System.out.println("Liste uzunluğu : "+treeset.size()); //.size -> İçerisinde kaç eleman olduğunu verir
        HashSet hashset= new HashSet<String>();

        hashset.addAll(treeset); // .addAll bir Collection'u bir Collection'a ekler.
        System.out.print("TreeSet sıralı : ");
        treeset.stream().forEach(a -> System.out.print(a+" "));
        System.out.println();
        System.out.print("HashSet sırasız : ");
        hashset.stream().forEach(a -> System.out.print(a+" "));
        System.out.println();
        hashset.remove("yeni"); //.remove ilgili objeyi listeden kaldırır
        System.out.println("Listeler birbirine eşit mi? "+hashset.equals(treeset)); //.equals -> Listelerin içeriğini kontrol eder.
        hashset.removeAll(hashset); // Parametre olarak verilen listedeki tüm elelmanları ilgili listeden kaldırır.
        System.out.print("HashSet sırasız : ");
        hashset.stream().forEach(a -> System.out.print(a+" "));
        hashset.addAll(treeset);

        //Queue, List
        //Linkedlist
        System.out.println("\n------LinkedList-------");
        LinkedList <String>linkedList = new LinkedList();
        linkedList.add("Cem"); // Bir sonraki indexe veri ekler
        linkedList.add(0,"Üveys"); // Veriyi belirtilen index üzerine ekler
        linkedList.addFirst("First"); ///---> Listenin ilk indeksine veri ekler
        linkedList.addLast("Last"); ///---> Listenin son indeksine veri ekler
        linkedList.removeFirst(); // Listenin ilk verisini siler
        linkedList.removeLast(); // Listenin sonundaki veriyi siler
        linkedList.get(0); // Parametre olarak aldığı index numrasındaki değeri getirir
        linkedList.getFirst(); // Listenin ilk index bulunan değeri getirir
        linkedList.getLast(); // Listenin son index yer alan değeri getirir
        System.out.print("LinkeList : ");
        linkedList.stream().forEach(a -> System.out.print(a+" "));
        //List
        //ArrayList
        System.out.println("\n------ArrayList-------");
        ArrayList<String> arrayList=new ArrayList<>();
        treeset.add("zzzz");
        arrayList.addAll(treeset);
        arrayList.addAll(hashset);
        System.out.print("ArrayList : ");
        arrayList.stream().forEach(a -> System.out.print(a+" "));









    }
}