import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean[] b = new boolean[10001];
        b[0] = true;
        b[1] = true;
        for(int i=2; i<10001; i++){
            if(b[i]==true){
                continue;
            }
            for(int j=i*i; j<10001; j+=i){
                b[j]=true;
            }
        }
        
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int a = n/2;
            for(int j=a; j>1; j--){
                if(b[j]==false && b[n-j]==false){
                    System.out.println(j+" "+(n-j));
                    break;
                }
            }
        }
    }
}
