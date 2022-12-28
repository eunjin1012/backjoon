import java.util.*;

public class Main{
    public static int n;
    public static int[][] arr;
    public static int MIN = Integer.MAX_VALUE;
    public static boolean[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        b = new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        number(0, 0);
        System.out.println(MIN);
    }
    public static void number(int x, int v){
        if(v==n/2){
            number2();
            return;
        }
        for(int i=x; i<n; i++){
                if(b[i]==false){
                    b[i] = true;
                    number(i+1, v+1);
                    b[i] = false;
            }
        }
    }
    public static void number2(){
        int start = 0;
        int end = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(b[i]==true && b[j]==true){
                    start+=arr[i][j];
                    start+=arr[j][i];
                }
                else if(b[i]==false && b[j]==false){
                    end+=arr[i][j];
                    end+=arr[j][i];
                }
            }
        }
        int d = Math.abs(start-end);
        
        MIN = Math.min(d, MIN);
    }
}
