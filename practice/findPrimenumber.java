import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count2=0;
        int count=0;
        for(int i=0; i<N; i++){
            int num=sc.nextInt();
            count2=0;
            for(int j=1; j<=num; j++){
                if(num%j==0)
                    count2++;
            }
            if(count2==2)
                count++;
        }
        System.out.print(count);
    }
}
