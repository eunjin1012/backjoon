import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double[] arr=new double[N];
        double average=0;
        double max=0;
        
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            average+=(arr[i]/max*100)/N;
        }
        System.out.println(average);
    }
}
