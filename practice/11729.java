import java.util.*;
import java.io.*;

public class Main{
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb.append((int)Math.pow(2, n)-1+"\n");
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }
    public static void hanoi(int n, int A, int B, int C){
        if(n==1){
            sb.append(A+" "+C+"\n");
            return;
        }
        hanoi(n-1, A, C, B);
        sb.append(A+" "+C+"\n");
        hanoi(n-1, B, A, C);
    }
}
