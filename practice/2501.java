import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                if(count==m){
                    System.out.println(i);
                }
            }
        }
        if(count<m){
            System.out.println(0);
        }
    }
}
