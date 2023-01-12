import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int m = Integer.parseInt(st.nextToken());
            if(list.get(list.size()-1) < m){
                list.add(m);
            }
            else{
                int first = 1;
                int last = list.size()-1;
                while(first<last){
                    int mid = (first+last)/2;
                    if(list.get(mid) < m){
                        first = mid+1;
                    }
                    else{
                        last = mid;
                    }
                }
                list.set(last, m);
            }
        }
        System.out.println(list.size()-1);
    }
}
