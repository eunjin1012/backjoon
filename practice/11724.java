import java.util.*;

public class Main{
    public static int n, m;
    public static int[][] arr;
    public static boolean[] check;
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        for(int j=1; j<=n; j++){
            if(check[j]==false){
                bfs(j);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void bfs(int a){
        check[a] = true;
        for(int i=1; i<=n; i++){
            if(arr[a][i]==1 && check[i]==false){
                bfs(i);
            }
        }
    }
}
