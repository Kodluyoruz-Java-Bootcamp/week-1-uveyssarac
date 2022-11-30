import java.util.Arrays;

public class MyList {
    private int size =0;
    private static final int DEFAULT_CAPACITY = 5;
    private int capacity =DEFAULT_CAPACITY;
    private String[] dizi= new String[DEFAULT_CAPACITY];


    public void add(String element){
        if (element.charAt(0) == 'C') {
            if(size +1>= capacity){
                grow();
           }
            this.dizi[size]=element;
            size++;
        }else{
            //System.out.println("Girilen String 'C' ile başlamalıdır. ");
        }
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(this.dizi[i]);
        }
    }
    private String[] grow(){
        dizi = Arrays.copyOf(dizi, capacity +7);
        this.capacity +=7;
        return dizi;
    }

}
