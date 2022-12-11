import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int count=0;
        int sum = n;
        do{
            n = ((n%10)*10) + (((n/10)+(n%10)) % 10);
            count++;
        }
        while(sum!=n);
        System.out.println(count);
       }
    }
