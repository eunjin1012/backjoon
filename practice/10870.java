import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
        
    }
    public static int func(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return func(n-1)+func(n-2);
    }
}
