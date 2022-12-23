import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            arr[i] = m;            
        }
        Arrays.sort(arr);
        int first = arr[1]-arr[0];
        for(int i=2; i<n; i++){
            first = number(first, arr[i]-arr[i-1]);
        }
        for(int j=2; j<=first; j++){
            if(first%j==0){
                System.out.print(j+" ");
            }
        }
        
        }
    public static int number(int x, int y){
        while(y!=0){
            int reminder = x%y;
            x = y;
            y = reminder;
        }
        return x;
    }
    }  
