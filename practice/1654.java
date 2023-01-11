import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextLong();
        long[] arr = new long[k];
        long max = 0;
        for(int i=0; i<k; i++){
            arr[i] = sc.nextLong();
            max = Math.max(max, arr[i]);
        }
        long first = 1;
        long last = max;
        while(first<=last){
            long sum = 0;
            long mid = (first+last)/2;
            for(int i=0; i<k; i++){
                sum+=arr[i]/mid;
            }
            if(sum>=n){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        System.out.println(last);
    }
}
