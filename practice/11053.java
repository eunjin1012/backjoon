import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            arr[i] = m;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        for(int j=1; j<n; j++){
            dp[j] = 1;
            for(int k=0; k<j; k++){
                if(arr[k]<arr[j] && dp[j]<=dp[k]){
                    dp[j] = dp[k]+1;
                }
            }
        }
        int count = 0;
        for(int q:dp){
            count = Math.max(count, q);
        }
        System.out.println(count);
    }
}
