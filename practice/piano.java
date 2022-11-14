import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[8];
        String result="";
        
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            result+=arr[i];
        }
        if(result.equals("12345678")){
            System.out.println("ascending");
        }
        else if(result.equals("87654321")){
            System.out.println("descending");
        }
        else
            System.out.println("mixed");
    }
}
