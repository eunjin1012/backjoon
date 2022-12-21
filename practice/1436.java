import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int first = 666;
        while(count!=n){
            first++;
        if(String.valueOf(first).contains("666")){
            count++;
        }
      }
        System.out.println(first);
    }
}
