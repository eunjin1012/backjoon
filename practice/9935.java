import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            stack.push(c);
            if(stack.size()>=s.length()){
                boolean bo = true;
                for(int j=0; j<s.length(); j++){
                    if(stack.get(stack.size() - s.length() + j) != s.charAt(j)){
                        bo = false;
                        break;
                    }
                }
                if(bo==true){
                    for(int k=0; k<s.length(); k++){
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("FRULA");
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(char q : stack){
                sb.append(q);
            }
            System.out.println(sb.toString());
        }
    }
}
