import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()];
        String st="";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[i] = ch-'0';
        }
        
        Arrays.sort(arr);
        
        for(int i=s.length()-1; i>=0; i--){
            st+=arr[i];
        }
        System.out.println(st);
    }
}
