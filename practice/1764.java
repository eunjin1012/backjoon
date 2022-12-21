import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> map = new HashSet<String>();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            map.add(str);
        }
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(int j=0; j<m; j++){
            String s = br.readLine();
            if(map.contains(s)){
                count++;
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(String i:list) {
        	System.out.println(i);
        }
    }
}
