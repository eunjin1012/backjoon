import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ball = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j=a; j<=b; j++){
                ball[j] = c;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(ball[i]+" ");
        }
    }
}
