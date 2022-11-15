import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        
        int result=A*B*C;
        
        while(result>0){
            arr[result%10]++;
            result/=10;
        }
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
}
