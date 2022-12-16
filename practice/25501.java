import java.util.*;

public class Main{
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            count = 0;
            System.out.println(isPallindrome(s)+" "+count);
        }
    }
    public static int isPallindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static int recursion(String s, int i, int r){
        count++;
        if(i>=r) return 1;
        else if(s.charAt(i) != s.charAt(r)) return 0;
        else return recursion(s, i+1, r-1);
    }
}
