import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            char ch = str.charAt(0);
            char c = str.charAt(str.length()-1);
            System.out.print(ch);
            System.out.println(c);
        }
    }
}
