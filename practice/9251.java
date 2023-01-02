import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        int[][] arr = new int[str.length()+1][s.length()+1];
        for(int i=1; i<=str.length(); i++){
            for(int j=1; j<=s.length(); j++){
                if(str.charAt(i-1)==s.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        System.out.println(arr[str.length()][s.length()]);
    }
}
