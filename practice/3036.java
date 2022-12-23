import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++){
            if(arr[0]%arr[i]==0){
                int value = arr[0]/arr[i];
                System.out.println(value+"/"+"1");
            }
            else if(arr[0]%arr[i]!=0){
                int value2 = number(arr[0], arr[i]);
                int value3 = arr[0]/value2;
                int value4 = arr[i]/value2;
                System.out.println(value3+"/"+value4);
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
