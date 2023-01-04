import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int count = 0;
        for(int i=0; i<n; i++){
            count=(sc.nextInt()+count)%m;
            arr[count]++;
        }
        long result = arr[0];
        for(int i=0; i<m; i++){
            result+=(long)arr[i]*(arr[i]-1)/2;
        }
        System.out.println(result);
        
    }
}
