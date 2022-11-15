import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[26];
        String str=sc.nextLine().toUpperCase();
        
        for(int i=0; i<str.length(); i++){
            int count=str.charAt(i)-65;
            arr[count]++;
        }
        
        int max=-1;
        char c='?';
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                c=(char)(i+65);
            }
            else if(arr[i]==max){
                c='?';
            }
        }
        System.out.println(c);
    }
}
