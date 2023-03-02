import java.util.*;

public class Main{
    public static int n;
    public static int m;
    public static int[][] arr;
    public static int count = 0;
    public static boolean[] check;
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
        computer(1);
        System.out.println(count);
    }
    public static void computer(int a){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        while(!queue.isEmpty()){
            int p = queue.poll();
            check[p] = true;
            for(int i=1; i<n+1; i++){
                if(check[i]==false && arr[p][i]==1){
                    queue.add(i);
                    check[i] = true;
                    count++;
                }
            }
        }
    }
}
