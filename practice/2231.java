import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int total = 0;
        for(int i=0; i<n; i++){
            sum = i;
            int number = i;
            while(number!=0){
                sum+=number%10;
                number = number/10;
            }
            if(sum==n){
                total = i;
                break;
            }
            
        }
        System.out.println(total);
    }
}
