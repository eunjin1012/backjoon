import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k=1; k<n; k++){
            arr[k][0] += Math.min(arr[k-1][1], arr[k-1][2]);
            arr[k][1] += Math.min(arr[k-1][0], arr[k-1][2]);
            arr[k][2] += Math.min(arr[k-1][0], arr[k-1][1]);
        }
        System.out.println(Math.min(Math.min(arr[n-1][0], arr[n-1][1]), arr[n-1][2]));
    }
}
