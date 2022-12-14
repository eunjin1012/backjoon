import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr[i] = a;
            sum+=arr[i];
        }
        
        Arrays.sort(arr);
        int count = 0;
        int mid = arr[(n-1)/2];
        int range = arr[n-1]-arr[0];
        
        int mod = arr[0];
        int min = -1;
        boolean check = false;
        
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                count = 0;
            }
            if(min<count){
                min = count;
                mod = arr[i];
                check = true;
                
            }
            else if(min==count && check==true){
                mod = arr[i];
                check = false;
            }
        }
        
        System.out.println(Math.round(sum/n));
        System.out.println(mid);
        System.out.println(mod);
        System.out.println(range);
        
    }
}
