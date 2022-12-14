import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int max = 0;
        int l = 0;
        int h = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
                if(max<arr[i][j]){
                    max = arr[i][j];
                    l = i;
                    h = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((l+1)+" "+(h+1));
    }
}
