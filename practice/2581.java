import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int total=0;
        int min=10000;
        boolean[] b = new boolean[N+1];
        b[0]=true;
        b[1]=true;
        
        for(int i=2; i<=N; i++){
          for(int j=i*i; j<N+1; j+=i){
            b[j]=true;
          }
        }
        
        for(int i=M; i<=N; i++){
          if(b[i]==false){
            if(min>i){
              min=i;
            }
            total+=i;
          }
        }
                
        if(total==0){
            System.out.println(-1);
        }
        else{
            System.out.println(total);
            System.out.println(min);
        }
    }
}
