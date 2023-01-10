import java.util.*;

public class Main{
    static int[][] arr;
    static int one = 0;
    static int zero = 0;
    static int minus = 0;
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
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }
    public static void divide(int a, int x, int y){
    	int newsize = a/3;
        for(int i=x; i<x+a; i++){
            for(int j=y; j<y+a; j++){
                if(arr[i][j]!=arr[x][y]){
                    divide(newsize, x, y);
                    divide(newsize, x, y+newsize);
                    divide(newsize, x, y+2*newsize);
                    divide(newsize, x+newsize, y);
                    divide(newsize, x+newsize, y+newsize);
                    divide(newsize, x+newsize, y+2*newsize);
                    divide(newsize, x+2*newsize, y);
                    divide(newsize, x+2*newsize, y+newsize);
                    divide(newsize, x+2*newsize, y+2*newsize);
                    return;
                }
            }
        }
        if(arr[x][y]==0){
            zero++;
        }
        else if(arr[x][y]==1){
            one++;
        }
        else if(arr[x][y]==-1){
            minus++;
        }
    }
}
