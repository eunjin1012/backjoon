import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ball = new int[n+1];
        for(int i=0; i<=n; i++){
            ball[i] = i;
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 0;
            temp = ball[a];
            ball[a] = ball[b];
            ball[b] = temp;
        }
        for(int j=1; j<=n; j++){
            System.out.print(ball[j]+" ");
        }
    }
}
