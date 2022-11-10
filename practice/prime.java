import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        boolean[] ox = new boolean[M+1];
        ox[0]=true;
        ox[1]=true;
        
        for(int i=2; i<M+1; i++){
            if(ox[i]==true){
                continue;
            }
            for(int j=i+i; j<M+1; j=j+i){
                ox[j]=true;
            }
        }
        
        for(int i=N; i<M+1; i++){
            if(ox[i]==false){
            System.out.println(i);
        }
        }
    }
}
