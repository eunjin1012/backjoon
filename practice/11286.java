import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2) ->
          Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
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
