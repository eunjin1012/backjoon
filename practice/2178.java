import java.util.*;

public class Main{
    public static int n, m;
    public static int[][] arr;
    public static boolean[][] check;
    public static int[] x = {-1, 1, 0, 0};
    public static int[] y = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        check[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[n-1][m-1]);
    }
    public static void bfs(int a, int b){
        check[a][b] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {a, b});
        while(!queue.isEmpty()){
            int[] c = queue.poll();
            int w = c[0];
            int h = c[1];
            for(int i=0; i<4; i++){
                int dx = w + x[i];
                int dy = h + y[i];
                if(dx>=0 && dy>=0 && dx<n && dy<m){
                    if(arr[dx][dy]==1 && check[dx][dy]==false){
                        queue.add(new int[] {dx, dy});
                        arr[dx][dy] = arr[w][h] + 1;
                        check[dx][dy] = true;
                    }
                }
            }
        }
    }
}
