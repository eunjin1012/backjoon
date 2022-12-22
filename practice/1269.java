import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> map = new HashSet<Integer>();
        HashSet<Integer> map2 = new HashSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            map.add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<m; j++){
            int b = Integer.parseInt(st.nextToken());
            map2.add(b);
        }
        int count = 0;
        for(int i:map){
            if(!map2.contains(i)){
                count++;
            }
        }
        for(int j:map2){
            if(!map.contains(j)){
                count++;
            }
        }
        System.out.println(count);
    }
}
