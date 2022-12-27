import java.util.*;

public class Main{
    public static int n;
    public static int[] arr;
    public static int[] arr2;
    public static int ma = Integer.MIN_VALUE;
    public static int mi = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        arr2 = new int[4];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<4; j++){
            arr2[j] = sc.nextInt();
        }
        number(arr[0], 1);
        System.out.println(ma);
        System.out.println(mi);
    }
    public static void number(int x, int y){
        if(y==n){
            ma = Math.max(ma, x);
            mi = Math.min(mi, x);
            return;
        }
            for(int k=0; k<4; k++){
            if(arr2[k]!=0){
                arr2[k]--;
                if(k==0){
                    number(x+arr[y], y+1);
                }
                else if(k==1){
                    number(x-arr[y], y+1);
                }
                else if(k==2){
                    number(x*arr[y], y+1);
                }
                else if(k==3){
                    number(x/arr[y], y+1);
                }
                arr2[k]++;
            }
        }
    }
}
