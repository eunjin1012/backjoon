import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			int count=0;
			boolean [] b = new boolean[2*n+1];
			for(int i=1; i<=2*n; i++) {
				if(i==1) {
					b[i]=true;
				} else if(b[i]==false){
					for(int j=2; i*j<=2*n; j++) {
						b[i*j]=true;	
					}
				}
			}
			for(int i=n+1; i<=2*n; i++) {
				if(b[i]==false) {
					count++;
				}
			}
			System.out.println(count);
		}
        
    }
}
