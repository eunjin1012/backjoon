import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char arr[] = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            arr[i] = c;
        }
        for(int i=0; i<n; i++){
            char s = sc.next().charAt(0);
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;
            for(int j=b; j<=c; j++){
                if(arr[j]==s){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
