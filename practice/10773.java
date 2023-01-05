import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            if(m==0){
                st.pop();
            }
            else{
                st.push(m);
            }
        }
        for(int j : st){
            sum+=j;
        }
        System.out.println(sum);
    }
}
