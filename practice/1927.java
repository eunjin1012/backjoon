import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            if(m==0){
                if(q.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(q.poll());
                }
            }
            else{
                q.add(m);
            }
        }
    }
}
