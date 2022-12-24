import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long five = number(n)-number(n-m)-number(m);
        long two = number2(n)-number2(n-m)-number2(m);
        
        System.out.println(Math.min(five, two));
        
    }
    public static long number(long x){
        int count = 0;
        while(x>=5){
            count+= x/5;
            x = x/5;
        }
        return count;
    }
    public static long number2(long x){
        int count = 0;
        while(x>=2){
            count+= x/2;
            x = x/2;
        }
        return count;
    }
}
