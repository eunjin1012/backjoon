import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer s;
        for(int i=0; i<n; i++){
            s = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            bw.write(a+b+"\n");
        }
        bf.close();
        bw.flush();
        bw.close();
        }
    }
