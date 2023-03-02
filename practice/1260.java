import java.util.*;

public class Main{
    public static int n;
    public static int m;
    public static int v;
    public static int[][] arr;
    public static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        check = new boolean[n+1];
        bfs(v);
    }
    public static void dfs(int a){
        check[a] = true;
        System.out.print(a+" ");
        for(int i=1; i<n+1; i++){
            if(check[i]==false && arr[a][i]==1){
                dfs(i);
            }
        }
    }
    public static void bfs(int b){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(b);
        check[b] = true;
        System.out.print(b+" ");
        while(!queue.isEmpty()){
            int p = queue.poll();
            for(int j=1; j<n+1; j++){
                if(check[j]==false && arr[p][j]==1){
                    queue.add(j);
                    check[j] = true;
                    System.out.print(j+" ");
                }
            }
        }
    }
}
