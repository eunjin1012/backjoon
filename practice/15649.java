import java.util.*;

public class Main{
    static int[] arr;
    static boolean[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        b = new boolean[n];
        number(n, m, 0);
    }
    public static void number(int x, int y, int depth){
        if(depth==y){
            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println();
            return;
        }
        for(int j=0; j<x; j++){
            if(!b[j]){
                b[j] = true;
                arr[depth] = j+1;
                number(x, y, depth+1);
                b[j] = false;
            }
        }
    }
}
