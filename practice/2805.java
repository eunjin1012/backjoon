import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        long first = 1;
        long last = max;
        while(first<=last){
            long mid = (first+last)/2;
            long sum = 0;
            for(int i=0; i<n; i++){
            	if(arr[i]<mid) {
            		sum+=0;
            	}
            	else {
            		sum+=arr[i]-mid;
            	}
            }
            if(sum>=m){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        System.out.println(last);
    }
}
