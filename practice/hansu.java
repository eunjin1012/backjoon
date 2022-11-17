import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        if(N<100){
            System.out.println(N);
        }
        else{
            for(int i=100; i<=N; i++){
                int A=i/100;
                int B=i%100/10;
                int C=i%10;
                if((A-B)==(B-C)){
                    count++;
                }
            }System.out.println(99+count);
            
        }
    }
}
