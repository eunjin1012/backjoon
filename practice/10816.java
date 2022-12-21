import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<m; j++){
            int card2 = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(card2, 0)).append(' ');
        }
        System.out.println(sb);
    }
}
