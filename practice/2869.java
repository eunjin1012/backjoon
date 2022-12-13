import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int total = V-B;
        int day = A-B;
        int days = total/day;
        
        if(total % day!=0){
            days++;
            System.out.println(days);
        }
        else{
            System.out.println(days);
        }
    }
}
