import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = number(n, m);
        System.out.println(t);
        System.out.println(n*m/t);
    }
    public static int number(int x, int y){
        while(y!=0){
            int reminder = x%y;
            x = y;
            y = reminder;
        }
        return x;
    }     
}
