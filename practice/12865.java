import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight = sc.nextInt();
        int[][] arr = new int[n+1][2];
        for(int i=1; i<=n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[][] dp = new int[n+1][weight+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=weight; j++){
                dp[i][j] = dp[i-1][j];
                if(j-arr[i][0]>=0){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
                }
            }
        }
        System.out.println(dp[n][weight]);
    }
}
