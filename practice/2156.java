import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<n+1; i++){
            int m = sc.nextInt();
            arr[i] = m;
        }
        dp[0] = 0;
        dp[1] = arr[1];
        if(n>1){
            dp[2] = arr[1] + arr[2];
        }
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-3]+arr[i]+arr[i-1], dp[i-2]+arr[i]));
        }
        System.out.println(dp[n]);
    }
}
