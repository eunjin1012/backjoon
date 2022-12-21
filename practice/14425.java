import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<n; i++){
            map.put(br.readLine(), 1);
        }
        for(int j=0; j<m; j++){
            String str = br.readLine();
            if(map.containsKey(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
