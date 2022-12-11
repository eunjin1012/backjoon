import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        if(arr[0]==arr[1] && arr[1]==arr[2]){
            int score = 10000+(arr[0])*1000;
            System.out.println(score);
        }
        else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[0]==arr[2]){
            if(arr[0]==arr[1]){
                int score2 = 1000+(arr[0])*100;
                System.out.println(score2);
            }
            else if(arr[1]==arr[2]){
                int score3 = 1000+(arr[1])*100;
                System.out.println(score3);
            }
            else if(arr[0]==arr[2]){
                int score4 = 1000+(arr[2])*100;
                System.out.println(score4);
            }
        }
        else{
            int score5 = arr[0]*100;
            System.out.println(score5);
        }
        }
    }
