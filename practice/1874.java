import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int m = 0;
        while(n-->0){
            int number = sc.nextInt();
            if(m<number){
                for(int i=m+1; i<=number; i++){
                    st.push(i);
                    sb.append("+").append("\n");
                }
                m = number;
            }
            else if(st.peek()!=number){
                System.out.println("NO");
                return;
            }
            st.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
