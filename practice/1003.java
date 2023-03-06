import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            for(int j=2; j<=n; j++){
                zero[j] = zero[j-1] + zero[j-2];
                one[j] = one[j-1] + one[j-2];
            }
            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
