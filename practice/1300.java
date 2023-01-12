import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int first = 1;
        int last = k;
        int answer = 0;
        while(first<=last){
            int mid = (first+last)/2;
            int count = 0;
            for(int i=1; i<=n; i++){
                count+=Math.min(mid/i, n);
            }
            if(count<k){
                first = mid+1;
            }
            else{
                answer = mid;
                last = mid-1;
            }
        }
        System.out.println(answer);
	}
}
