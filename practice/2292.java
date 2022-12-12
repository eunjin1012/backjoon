import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int stair = 2;
        if(N==1){
            System.out.println(1);
        }
        else{
            while(stair<=N){
                stair+=(6*count);
                count++;
            }
            System.out.println(count);
        }
        
    }
}
