import java.util.*;
 
public class Main {
    public static int[] arr;
    public static int n;
    public static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        
        number(0);
        System.out.println(count);
        
	}
    public static void number(int x){
        if(x==n){
            count++;
            return;
        }
        for(int j=0; j<n; j++){
            arr[x] = j;
            if(location(x)==true){
                number(x+1);
            }
        }
    }
    public static boolean location(int y){
        for(int k=0; k<y; k++){
            if(arr[k]==arr[y]){
                return false;
            }
            else if(Math.abs(y-k)==Math.abs(arr[y]-arr[k])){
                return false;
            }
        }
        return true;
    }
}
