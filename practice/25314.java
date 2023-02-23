import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        while(n>3){
            str+="long ";
            n = n-4;
        }
        System.out.println(str+"int");
    }
}
