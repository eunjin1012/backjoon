import java.util.*;

public class Main{
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        divide(n, 0, 0);
        System.out.println(sb);
    }
    public static void divide(int a, int x, int y){
        boolean bo = true;
        for(int i=x; i<x+a; i++){
            for(int j=y; j<y+a; j++){
                if(arr[x][y]!=arr[i][j]){
                    bo = false;
                }
            }
        }
        if(bo==true){
            sb.append(arr[x][y]);
            return;
        }
        else{
            sb.append('(');
            divide(a/2, x, y);
            divide(a/2, x, y+a/2);
            divide(a/2, x+a/2, y);
            divide(a/2, x+a/2, y+a/2);
            sb.append(')');
        }
    }
}
