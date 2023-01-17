import java.util.*;
import java.io.*;

public class Main{
    static Stack<Oasis> stack = new Stack<Oasis>();
    static long count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            Oasis oasis = new Oasis(arr[i], 1);
            while(!stack.isEmpty() && stack.peek().height <= arr[i]){
                Oasis pop = stack.pop();
                count+=pop.count;
                if(pop.height == arr[i]){
                    oasis.count+=pop.count;
                }
            }
            if(!stack.isEmpty()){
                count++;
            }
            stack.push(oasis);
        }
        System.out.println(count);
    }
    static class Oasis{
        int height;
        int count;
        
        Oasis(int height, int count){
            this.height = height;
            this.count = count;
        }
    }
}
