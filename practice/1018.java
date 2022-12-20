import java.util.*;

public class Main{
    public static boolean[][] ox;
    public static int total = 64;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ox = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                if(str.charAt(j)=='W'){
                    ox[i][j]=true;
                }
                else{
                    ox[i][j]=false;
                }
            }
        }
        int x=n-7;
        int y=m-7;
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                chess(i, j);
            }
        }
        System.out.println(total);
    }
    public static void chess(int a, int b){
        int count = 0;
        boolean ab = ox[a][b];
        for(int i=a; i<a+8; i++){
            for(int j=b; j<b+8; j++){
                if(ox[i][j]!=ab){
                    count++;
                }
                ab=(!ab);
            }
            ab=(!ab);
        }
        count = Math.min(count, 64-count);
        total = Math.min(count, total);
    }
}
