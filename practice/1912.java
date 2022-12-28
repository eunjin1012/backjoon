import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr2[0] = arr[0];
        int MAX = arr[0];
        for(int j=1; j<n; j++){
            arr2[j] = Math.max(arr2[j-1]+arr[j], arr[j]);
            if(MAX<arr2[j]){
                MAX = arr2[j];
            }
        }
        System.out.println(MAX);
    }
}
