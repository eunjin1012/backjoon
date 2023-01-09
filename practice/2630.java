import java.util.*;

public class Main{
    static int[][] arr;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        divide(n, 0, 0);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void divide(int a, int x, int y){
        for(int i=x; i<x+a; i++){
            for(int j=y; j<y+a; j++){
                if(arr[i][j]!=arr[x][y]){
                    divide(a/2, x, y);
                    divide(a/2, x+a/2, y);
                    divide(a/2, x, y+a/2);
                    divide(a/2, x+a/2, y+a/2);
                    return;
                }
            }
        }
        if(arr[x][y]==0){
            white++;
        }
        else{
            blue++;
        }
    } 
}
