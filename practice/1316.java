import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i=0; i<n; i++){
            String s = sc.next();
            boolean[] b =new boolean[26];
            for(int j=0; j<s.length()-1; j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    if(b[s.charAt(j+1)-97]==true){
                        count--;
                        break;
                    }
                }
                b[s.charAt(j)-97]=true;
            }
        }
        System.out.println(count);
    }
}
