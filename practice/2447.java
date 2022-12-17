import java.util.*;
import java.io.*;

public class Main{
    static char[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        StringBuilder sb = new StringBuilder();
        star(0, 0, n, false);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static void star(int x, int y, int n, boolean b){
        if(b==true){
            for(int i=x; i<x+n; i++){
                for(int j=y; j<y+n; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if(n==1){
            arr[x][y] = '*';
            return;
        }
        int a = n/3;
        int count = 0;
        for(int i=x; i<x+n; i+=a){
            for(int j=y; j<y+n; j+=a){
                count++;
                if(count==5){
                    star(i, j, a, true);
                }
                else{
                    star(i, j, a, false);
                }
            }
        }
    }
}
