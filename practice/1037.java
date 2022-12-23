import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000;
        int max = 2;
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            
            if(m>max){
                max = m;
            }
            if(min>m){
                min = m;
            }
        }
        System.out.println(max*min);
    }
}
