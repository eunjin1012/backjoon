import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int j=n-1; j>=0; j--){
            if(arr[j]<=k){
                count+=k/arr[j];
                k = k % arr[j];
            }
        }
        System.out.println(count);
    }
}
