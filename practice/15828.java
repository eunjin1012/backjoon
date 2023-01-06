import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        while(true){
            int m = sc.nextInt();
            if(m==-1){
                break;
            }
            if(m==0){
                q.poll();
            }
            else if(n>q.size()){
            	q.add(m);
            }
            
        }
        if(q.isEmpty()) {
        	System.out.println("empty");
        }
        for(int j : q) {
        	System.out.print(j+" ");
        }
    }
}
