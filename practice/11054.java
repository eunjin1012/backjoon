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
        int[] dp2 = new int[n+1];
        dp[1] = 1;
        dp2[n] = 1;
        for(int j=2; j<n; j++){
            dp[j] = 1;
            for(int k=0; k<j; k++){
                if(arr[k]<arr[j]){
                    dp[j] = Math.max(dp[k]+1, dp[j]);
                }
            }
        }
        for(int j=n-1; j>0; j--){
            dp2[j] = 1;
            for(int k=n; k>j; k--){
                if(arr[k]<arr[j]){
                    dp2[j] = Math.max(dp2[k]+1, dp2[j]);
                }
            }
        }
        int count = 0;
        for(int q=1; q<=n; q++){
            count = Math.max(count, dp[q]+dp2[q]);
        }
        System.out.println(count-1);
    }
}
