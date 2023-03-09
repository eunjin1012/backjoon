import java.util.*;

public class Main{
    public static int m, n, h;
    public static int[][][] arr;
    public static Queue<tomato> queue;
    public static int[] dx = {-1, 0, 1, 0, 0, 0};
    public static int[] dy = {0, 1, 0, -1, 0, 0};
    public static int[] dz = {0, 0, 0, 0, 1, -1};
    static class tomato{
        int x;
        int y;
        int z;
        int day;
        tomato(int z, int x, int y, int day){
            this.z = z;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        arr = new int[h][n][m];
        queue = new LinkedList<tomato>();
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    arr[i][j][k] = sc.nextInt();
                    if(arr[i][j][k]==1){
                        queue.add(new tomato(i, j, k, 0));
                    }
                }
            }
        }
        bfs();
    }
    public static void bfs(){
        int day = 0;
        while(!queue.isEmpty()){
            tomato to = queue.poll();
            day = to.day;
            for(int i=0; i<6; i++){
                int ux = to.x + dx[i];
                int uy = to.y + dy[i];
                int uz = to.z + dz[i];
                if(ux>=0 && uy>=0 && uz>=0 && ux<n && uy<m && uz<h){
                    if(arr[uz][ux][uy]==0){
                        arr[uz][ux][uy] = 1;
                        queue.add(new tomato(uz, ux, uy, day+1));
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
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    if(arr[i][j][k]==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
