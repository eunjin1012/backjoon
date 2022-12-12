import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr = new int[15][15];
        
        for(int i=0; i<15; i++){
            arr[0][i]=i;
            
        }
        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        for(int k=0; k<T; k++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(arr[a][b]);
        }
    }
}
