import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr;
        
        for(int i=0; i<n; i++){
            int student = sc.nextInt();
            arr = new int[student];
            int sum=0;
            for(int j=0; j<student; j++){
                int score = sc.nextInt();
                arr[j] = score;
                sum+=score;
            }
            double average = (double)sum/student;
            double count=0;
            for(int k=0; k<student; k++){
                if(average<arr[k]){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/student)*100);
        }
    }
}
