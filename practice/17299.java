import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[1000001];
        int[] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            count[arr[i]]++;
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int j=0; j<n; j++){
            while(!stack.isEmpty() && count[arr[stack.peek()]] < count[arr[j]]){
                result[stack.pop()] = arr[j];
            }
            stack.push(j);
        }
        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<n; k++){
            sb.append(result[k]).append(' ');
        }
        System.out.println(sb);
    }
}
