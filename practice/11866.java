import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        System.out.print("<");
        while(q.size()>0){
            for(int i=0; i<m-1; i++){
                q.add(q.poll());
            }
            System.out.print(q.poll());
            if(q.size()==0) {
            	System.out.print(">");
            }
            else {
            	System.out.print(", ");
            }
            
        }
    }
}
