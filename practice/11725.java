import java.util.*;
import java.io.*;

public class Main{
    static ArrayList<Integer>[] list;
    static int[] tree;
    static boolean[] b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            list[i] = new ArrayList<>();
        }
        for(int j=0; j<n-1; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        tree = new int[n+1];
        b = new boolean[n+1];
        node(1);
        
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=n; i++){
            sb.append(tree[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void node(int c){
        for(int d : list[c]){
            if(b[d]==false){
                tree[d] = c;
                b[d] = true;
                node(d);
            }
        }
    }
}
