import java.util.*;

public class Main{
    public static int m, n, k;
    public static int[][] arr;
    public static boolean[][] check;
    public static int[] lr = {-1, 1, 0, 0};
    public static int[] ub = {0, 0, -1, 1};
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();
            int count = 0;
            arr = new int[m][n];
            check = new boolean[m][n];
            for(int j=0; j<k; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] = 1;
            }
            for(int p=0; p<m; p++){
                for(int q=0; q<n; q++){
                    if(arr[p][q]==1 && check[p][q]==false){
                        dfs(p, q);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int a, int b){
        check[a][b] = true;
        for(int i=0; i<4; i++){
            int l = a + lr[i];
            int u = b + ub[i];
            if(l>=0 && u>=0 && l<m && u<n){
                if(arr[l][u]==1 && check[l][u]==false){
                    dfs(l, u);
                }
            }
        }
    }
}
