import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[1];
        if(n>=2){
            dp[2] = arr[1] + arr[2];
        }
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-2]+arr[i], arr[i-1]+arr[i]+dp[i-3]);
        }
        System.out.println(dp[n]);
    }
}
