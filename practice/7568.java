import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            int rank = 1;
            for(int k=0; k<n; k++){
                if(arr[j][0]<arr[k][0] && arr[j][1]<arr[k][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}
