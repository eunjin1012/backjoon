import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for(int j=0; j<n; j++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[j]){
                int height = arr[stack.pop()];
                int width = 0;
                if(stack.isEmpty()){
                    width = j;
                }
                else{
                    width = j-1-stack.peek();
                }
                result = Math.max(result, height*width);
            }
            stack.push(j);
        }
        while(!stack.isEmpty()){
            int height = arr[stack.pop()];
            int width = 0;
            if(stack.isEmpty()){
                width = n;
            }
            else{
                width = n-1-stack.peek();
            }
            result = Math.max(result, height*width);
        }
        System.out.println(result);
    }
}
