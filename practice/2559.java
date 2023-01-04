import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<=n-m; j++){
            int count = 0;
            for(int k=j; k<j+m; k++){
                count+=arr[k];
            }
            MAX = Math.max(MAX, count);
        }
        System.out.println(MAX);
    }
}
