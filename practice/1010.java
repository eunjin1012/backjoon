import java.util.*;

public class Main{
    static int[][] arr = new int[30][30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(combination(m, n));
        }
    }
    public static int combination(int x, int y){
        if(arr[x][y]>0){
            return arr[x][y];
        }
        if(x==y || y==0){
            return arr[x][y]=1;
        }
        return arr[x][y] = combination(x-1, y-1) + combination(x-1, y);
    }
} 
