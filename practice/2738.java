import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        
        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                for(int h=0; h<M; h++){
                arr[j][h]+=sc.nextInt();
                }
            }
        }
        for(int k=0; k<N; k++){
            for(int m=0; m<M; m++){
                System.out.print(arr[k][m]+" ");
            }
            System.out.println("");
        }
    }
}
