import java.util.*;

public class Main{
    public static long[] arr = new long[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        
        for(int j=3; j<arr.length; j++){
            arr[j] = -1;
        }
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            System.out.println(number(n));
        }
        
    }
    public static long number(int n){
        if(arr[n]==-1){
            arr[n] = number(n-2)+number(n-3);
        }
        return arr[n];
    }
}
