import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] arr = new long[n+1][10];
        
        for(int i=1; i<10; i++){
            arr[1][i] = 1;
        }
        
        for(int j=2; j<=n; j++){
            for(int k=0; k<10; k++){
                if(k==0){
                    arr[j][k] = arr[j-1][1]%1000000000;
                }
                else if(k==9){
                    arr[j][k] = arr[j-1][8]%1000000000;
                }
                else{
                    arr[j][k] = (arr[j-1][k-1] + arr[j-1][k+1])%1000000000;
                }
            }
        }
        long answer = 0;
        for(int y=0; y<10; y++){
            answer+=arr[n][y];
        }
        System.out.println(answer%1000000000);
    }
}
