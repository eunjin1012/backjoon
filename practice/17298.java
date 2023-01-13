import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int j=0; j<n; j++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[j]){
                arr[stack.pop()] = arr[j];
            }
            stack.push(j);
        }
		while(!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<n; k++){
            sb.append(arr[k]).append(' ');
        }
        System.out.println(sb);
	}
}
