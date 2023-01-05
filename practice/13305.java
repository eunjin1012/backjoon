import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n-1];
        long[] dp = new long[n];
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextLong();
        }
        for(int j=0; j<n; j++){
            dp[j] = sc.nextLong();
        }
        long start = dp[0];
        long total = 0;
        for(int k=0; k<n-1; k++){
            if(start>dp[k]){
                start = dp[k];
            }
            total+=(start*arr[k]);
        }
        System.out.println(total);
    }
}
