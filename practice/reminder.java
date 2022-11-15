import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int count=0;
        
        for(int i=0; i<10; i++){
            arr[i]=sc.nextInt()%42;
        }
        for(int i=0; i<10; i++){
            int cnt=0;
            for(int k=i+1; k<10; k++){
                if(arr[i]==arr[k]){
                    cnt++;
                }
            }
            if(cnt==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
