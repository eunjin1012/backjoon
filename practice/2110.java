import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int first = 1;
        int last = arr[n-1]-arr[0];
        while(first<=last){
            int mid = (first+last)/2;
            int set = arr[0];
            int count = 1;
            for(int i=0; i<n; i++){
                int d = arr[i]-set;
                if(d>=mid){
                    count++;
                    set = arr[i];
                }
            }
            if(count>=m){
                first = mid+1;
                answer = mid;
            }
            else{
                last = mid-1;
            }
        }
        System.out.println(answer);
    }
}
