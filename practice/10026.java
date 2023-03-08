import java.util.*;
 
public class Main {
    public static int n;
    public static char[][] arr;
    public static boolean[][] check;
    public static int[] x = {-1, 1, 0, 0};
    public static int[] y = {0, 0, -1, 1};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new char[n][n];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        int count = 0;
        check = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(check[i][j]==false){
                    dfs(i, j);
                    count++;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 'G'){
                    arr[i][j] = 'R';
                }
            }
        }
        int count2 = 0;
        check = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(check[i][j]==false){
                    dfs(i, j);
                    count2++;
                }
            }
        }
        System.out.println(count + " " + count2);
    }
    public static void dfs(int a, int b){
        check[a][b] = true;
        for(int i=0; i<4; i++){
            int dx = a + x[i];
            int dy = b + y[i];
            if(dx>=0 && dy>=0 && dx<n && dy<n){
                if(arr[dx][dy]==arr[a][b] && check[dx][dy]==false){
                    dfs(dx, dy);
                }
            }
        }
    }
}
