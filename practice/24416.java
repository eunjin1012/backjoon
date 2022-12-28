import java.util.*;

public class Main{
    public static int[] arr;
    public static int count = 0;
    public static int count2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        fib(n);
        fibonacci(n);
        System.out.println(count);
        System.out.println(count2);
    }
    public static int fib(int n){
        if(n==1 || n==2){
            count++;
            return 1;
        }
        else{
            return (fib(n-1)+fib(n-2));
        }
    }
    public static int fibonacci(int n){
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<n; i++){
            count2++;
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
