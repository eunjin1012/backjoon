import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        Arrays.sort(arr);
        for(int j:arr){
            sb.append(j).append("\n");
        }
        System.out.println(sb);
    }
}
