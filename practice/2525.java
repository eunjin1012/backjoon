import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for(int i=0; i<2; i++){
            arr[i]=sc.nextInt();
        }
        int hour = sc.nextInt();
        int minute = arr[1]+hour;
        if(minute>=60){
            int minute2 = minute%60;
            int hour2 = minute/60;
            int hour3 = arr[0]+hour2;
            if(hour3==24){
                System.out.println("0 "+minute2);
            }
            else if(hour3>24){
                int hour4 = hour3-24;
                System.out.println(hour4+" "+minute2);
            }
            else{
                System.out.println(hour3+" "+minute2);
            }
        }
        else if(minute<60){
            System.out.println(arr[0]+" "+minute);
        }
        }
    }
