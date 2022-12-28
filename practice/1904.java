import java.util.*;

public class Main{
    public static int[] arr = new int[1000001];
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=3; i<arr.length; i++){
            arr[i] = -1;
        }
        System.out.println(number(n));
        
    }
    public static int number(int n){
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        if(arr[n]==-1){
            arr[n] = (number(n-1)+number(n-2)) % 15746;
        }
        return arr[n];
    }
}
