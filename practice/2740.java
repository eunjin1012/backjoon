import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr2 = new int[a][b];
        for(int k=0; k<a; k++){
            for(int l=0; l<b; l++){
                arr2[k][l] = sc.nextInt();
            }
        }
        int[][] arr3 = new int[n][b];
        for(int i=0; i<n; i++){
            for(int j=0; j<b; j++){
                int sum = 0;
                for(int k=0; k<m; k++){
                    sum+=arr[i][k]*arr2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
