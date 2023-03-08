import java.util.*;

public class Main{
    public static int n, m;
    public static int[][] arr;
    public static Queue<box> queue;
    public static int[] x = {-1, 1, 0, 0};
    public static int[] y = {0, 0, -1, 1};
    static class box{
        int w;
        int h;
        int day;
        box(int w, int h, int day){
            this.w = w;
            this.h = h;
            this.day = day;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m][n];
        queue = new LinkedList<box>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    queue.add(new box(i, j, 0));
                }
            }
        }
        bfs();
    }
    public static void bfs(){
        int day = 0;
        while(!queue.isEmpty()){
            box b = queue.poll();
            day = b.day;
            for(int i=0; i<4; i++){
                int dx = b.w + x[i];
                int dy = b.h + y[i];
                if(dx>=0 && dy>=0 && dx<m && dy<n){
                    if(arr[dx][dy]==0){
                        arr[dx][dy] = 1;
                        queue.add(new box(dx, dy, day+1));
                    }
                }
            }
        }
        if(!check()){
            System.out.println(-1);
        }
        else{
            System.out.println(day);
        }
    }
        static boolean check(){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(arr[i][j]==0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
