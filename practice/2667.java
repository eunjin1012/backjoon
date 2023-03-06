import java.util.*;

public class Main{
    public static int n;
    public static int[][] arr;
    public static boolean[][] check;
    public static int count;
    public static ArrayList<Integer> list;
    public static int[] x = {-1, 1, 0, 0};
    public static int[] y = {0, 0, -1, 1};
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<Integer>();
        n = sc.nextInt();
        arr = new int[n][n];
        check = new boolean[n][n];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1 && check[i][j]==false){
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int k : list){
            System.out.println(k);
        }
    }
    public static void dfs(int a, int b){
        check[a][b] = true;
        count++;
        for(int i=0; i<4; i++){
            int lr = a + x[i];
            int ub = b + y[i];
            if(lr>=0 && ub>=0 && lr<n && ub<n){
                if(arr[lr][ub]==1 && check[lr][ub]==false){
                    dfs(lr, ub);
                }
            }
        }
    }
}
