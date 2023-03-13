import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            int m = sc.nextInt();
            String number = sc.next();
            Deque<Integer> deque = new LinkedList<>();
            for(String s : number.substring(1, number.length()-1).split(",")){
                if(!s.equals("")){
                    deque.add(Integer.valueOf(s));
                }
            }
            System.out.println(rd(deque, str));
        }
    }
    public static String rd(Deque<Integer> queue, String str){
        boolean check = true;
        for(char c : str.toCharArray()){
            if(c=='R'){
                check = !check;
            }
            else{
                if(queue.size()==0){
                    return "error";
                }
                if(check==true){
                    queue.pop();
                }
                else{
                    queue.removeLast();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(!queue.isEmpty()){
            sb.append(check ? queue.pop() : queue.removeLast());
            if(queue.size()!=0){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
