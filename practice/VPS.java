import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
        	System.out.println(st(sc.next()));
        }
    }
    
    public static String st(String s){
    	Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
        	char c = s.charAt(i);
            
            if( c == '(') {
            	stack.push(c);
            } else if(stack.empty()){
            	return "NO";
            } else {
            	stack.pop();
            } 
        }
        
        if(stack.empty()){
        	return "YES";
        }
        else{
        	return "NO";
        }
        
    }
}
