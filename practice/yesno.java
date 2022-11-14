import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        
        for(int i=0; i<N; i++){
            String str=sc.next();
            int sum=0;
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='O'){
                    count++;
                    sum+=count;
                }
                else
                    count=0;
                
            }
            System.out.println(sum);
        }
    }
}
