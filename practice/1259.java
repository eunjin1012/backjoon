import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            String s = "yes";
            if(str.equals("0")){
                break;
            }
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    s = "no";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
