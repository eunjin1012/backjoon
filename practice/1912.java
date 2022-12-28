import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr2[0] = arr[0];
        int MAX = arr[0];
        for(int i=1; i<n; i++){
            arr2[i] = Math.max(arr2[i-1]+arr[i], arr[i]);
            MAX = Math.max(MAX, arr2[i]);
        }
        System.out.println(MAX);
        
    }
}
