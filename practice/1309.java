import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[100001];
        dp[1] = 3;
        dp[2] = 7;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-1]) % 9901;
        }
        System.out.println(dp[n]);
    }
}