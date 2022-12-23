import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = number(a, b);
            System.out.println(a*b/n);
            
        }
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
