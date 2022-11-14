import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[9];
        int max=0;
        int number=0;
        
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                number=i;
            }
        }
        System.out.println(max);
        System.out.println(number+1);
    }
}
