import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals(".")){
                break;
            }
            System.out.println(sta(str));
        }
    }
    private static String sta(String str){
        Stack<Character> st = new Stack<Character>();
        char c;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c=='(' || c=='['){
                st.push(c);
            }
            else if(c==')'){
                if(st.isEmpty() || st.peek()!='('){
                    return "no";
                }
                else{
                    st.pop();
                }
            }
            else if(c==']'){
                if(st.isEmpty() || st.peek()!='['){
                    return "no";
                }
                else{
                    st.pop();
                }
            }
            
        }
        if(st.isEmpty()){
                return "yes";
            }
            else{
                return "no";
            }
    }
}
