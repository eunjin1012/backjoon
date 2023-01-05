import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int sum = 0;
        int count = 0;
        for(int j=0; j<n; j++){
            sum+=count+arr[j];
            count+=arr[j];
        }
        
        System.out.println(sum);
    }
}
