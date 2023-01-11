import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int j=0; j<a; j++){
            int count = 0;
            int first = 0;
            int last = n-1;
            int b = Integer.parseInt(st.nextToken());
            while(first<=last){
                int mid = (first+last)/2;
                if(arr[mid]==b){
                    count = 1;
                    break;
                }
                else{
                    if(arr[mid]>b){
                        last = mid-1;
                    }
                    else{
                        first = mid+1;
                    }
                }
                
            }
            System.out.println(count);
        }
    }
}
