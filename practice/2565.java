import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] arr = new int[n+1][2];
        for(int i=1; i<=n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0]-o2[0];
            }
        });
        for(int i=1; i<=n; i++){
            dp[i] = 1;
            for(int j=1; j<i; j++){
                if(arr[i][1]>arr[j][1]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
            count = Math.max(count, dp[i]);
        }
        
        System.out.println(n-count);
        
    }
}
