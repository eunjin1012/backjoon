import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[6][2];
        int maxw = 0;
        int maxh = 0;
        int indexw = -1;
        int indexh = -1;
        for(int i=0; i<6; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            
            if(arr[i][0]==1 || arr[i][0]==2){
                if(maxw<arr[i][1]){
                    maxw = arr[i][1];
                    indexw = i;
                }
            }
            else if(arr[i][0]==3 || arr[i][0]==4){
                if(maxh<arr[i][1]){
                    maxh = arr[i][1];
                    indexh = i;
                }
            }
            
        }
        int min = arr[(indexw+3)%6][1] * arr[(indexh+3)%6][1];
        int rectangle = (maxw*maxh)-(min);
        System.out.println(rectangle*n);
        }
    }
