import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int count = 0;
        while(true){
            if(N%5==0){ 
                count += N/5; 
                break;
            } else {
                N -= 2; 
                count++;
            }
            if(N<0) { 
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
