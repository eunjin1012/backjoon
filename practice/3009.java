import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        if(arr[0]==arr[1]){
            System.out.print(arr[2]+" ");
        }
        else if(arr[1]==arr[2]){
            System.out.print(arr[0]+" ");
        }
        else{
            System.out.print(arr[1]+" ");
        }
        if(arr2[0]==arr2[1]){
            System.out.print(arr2[2]+" ");
        }
        else if(arr2[1]==arr2[2]){
            System.out.print(arr2[0]+" ");
        }
        else{
            System.out.print(arr2[1]+" ");
        }
        
        }
    }
