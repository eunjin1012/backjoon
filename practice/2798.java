import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = 0;
        int sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
            for(int j=0; j<n-2; j++){
            for(int k=j+1; k<n-1; k++){
                for(int a=k+1; a<n; a++){
                    sum = arr[j]+arr[k]+arr[a];
                    if(total<sum && sum<=m){
                        total = sum;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
