import java.util.*;
import java.io.*;

public class Main{
    public static int[] arr;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<m; j++){
            int card = Integer.parseInt(st.nextToken());
            sb.append(solve(card, 0, n-1)+" ");
        }
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int solve(int key, int low, int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return 1;
            }
            else if(key>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return 0;
    }
}
