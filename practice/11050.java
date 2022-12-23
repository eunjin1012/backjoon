import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = factorial(n)/(factorial(k)*factorial(n-k));
        System.out.println(total);
    }
    public static int factorial(int x){
        int result = 1;
        for(int i=x; i>=1; i--){
            result*=i;
        }
        return result;
    }
    } 
