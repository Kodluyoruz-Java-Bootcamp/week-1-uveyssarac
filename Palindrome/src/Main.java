public class Main {
    public static boolean isPalindrom(long n){
        long reverse = reverse(n);

        if(n==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static long reverse(long n){
        long temp=n;
        long reverse = 0;
        while(temp != 0)
        {
            long remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        int max=0, count=1;
        long maxIndex=0;
        String str="";


        for (int i = 10; i < 100; i++) {
            long number= i;
            number+=reverse(i);
            count=0;
            while(!isPalindrom(number)){
                number+=reverse(number);
                count++;
            }
            if(count>max){
                maxIndex=i;
                max=count;
            }
        }
        System.out.print(maxIndex+" : ");
        maxIndex+=reverse(maxIndex);
        while(!isPalindrom(maxIndex)){
            str="{ palindrom değil : "+maxIndex+" }";
            System.out.print(str);
            maxIndex+=reverse(maxIndex);
        }
        System.out.print("{ palindrom : "+ maxIndex +" }");
        System.out.println();
    }
}