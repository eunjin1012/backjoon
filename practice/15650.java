import java.util.*;
 
public class Main {
    public static int[] arr;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        number(n, m, 0, 1);
	}
    public static void number(int x, int y, int depth, int a){
        if(y==depth){
            for(int k : arr){
                System.out.print(k+" ");
            }
            System.out.println();
            return;
        }
        for(int j=a; j<=x; j++){
            arr[depth] = j;
            number(x, y, depth+1, j+1);
        }
    }
}
