import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        System.out.println(calculate(a, b, c));
    }
    public static long calculate(long x, long y, long z){
        if(y==0){
            return 1;
        }
        
        long j = calculate(x, y/2, z);
        if(y%2==0){
            return j * j % z;
        }
        else{
            return (j * j % z) * x % z;
        }
    }
}
