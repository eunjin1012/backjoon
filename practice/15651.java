import java.util.*;
 
public class Main {
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        number(n, m, 0);
        System.out.println(sb);
    }
    public static void number(int x, int y, int depth){
        if(y==depth){
            for(int k : arr){
                sb.append(k+" ");
            }
            sb.append("\n");
            return;
        }
        for(int j=0; j<x; j++){
            arr[depth] = j+1;
            number(x, y, depth+1);
        }
    }
}
