import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] check = new boolean[10];
        int standard = Math.abs(n-100);
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            check[a] = true;
        }
        for(int i=0; i<1000000; i++){
            String s = String.valueOf(i);
            int len = s.length();
            boolean b = true;
            for(int j=0; j<len; j++){
                int number = s.charAt(j)-'0';
                if(check[number]==true){
                    b = false;
                    break;
                }
            }
            if(b==true){
                int min = Math.abs(n-i)+len;
                standard = Math.min(min, standard);
            }
        }
        System.out.println(standard);
    }
}
