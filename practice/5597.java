import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[31];
        for(int i=1; i<29; i++){
            int number = sc.nextInt();
            arr[number] = 1;
        }
        for(int j=1; j<31; j++){
            if(arr[j]!=1){
                System.out.println(j);
            }
        }
    }
}
