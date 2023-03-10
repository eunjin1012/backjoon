import java.util.*;

public class Main{
    public static int n, m;
    public static int[][] arr;
    public static boolean[][] check;
    public static int[] x = {-1, 1, 0, 0};
    public static int[] y = {0, 0, -1, 1};
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                check[i][j] = true;
                dfs(i, j, arr[i][j], 1);
                check[i][j] = false;
            }
        }
        System.out.println(max);
    }
    public static void dfs(int a, int b, int sum, int count){
        if(count==4){
            max = Math.max(sum, max);
            return;
        }
        for(int i=0; i<4; i++){
            int dx = a + x[i];
            int dy = b + y[i];
            if(dx>=0 && dy>=0 && dx<n && dy<m){
                if(check[dx][dy]==false){
                    if(count==2){
                        check[dx][dy] = true;
                        dfs(a, b, sum + arr[dx][dy], count+1);
                        check[dx][dy] = false;
                    }
                    check[dx][dy] = true;
                    dfs(dx, dy, sum + arr[dx][dy], count+1);
                    check[dx][dy] = false;
                }
            }
        }
    }
}
