import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), "-");
        int sum = Integer.MAX_VALUE;
        while(st.hasMoreTokens()){
            int count = 0;
            StringTokenizer s = new StringTokenizer(st.nextToken(), "+");
            while(s.hasMoreTokens()){
                count+=Integer.parseInt(s.nextToken());
            }
            if(sum==Integer.MAX_VALUE){
                sum=count;
            }
            else{
                sum = sum-count;
            }
        }
        System.out.println(sum);
    }
}
