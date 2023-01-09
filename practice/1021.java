import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int[] arr = new int[m];
        for(int j=0; j<m; j++){
            arr[j] = sc.nextInt();
        }
        for(int k=0; k<m; k++){
            if(q.indexOf(arr[k])<=q.size()/2){
                while(arr[k]!=q.getFirst()){
                    q.add(q.poll());
                    count++;
                }
            }
            else{
                while(arr[k]!=q.getFirst()){
                    q.addFirst(q.removeLast());
                    count++;
                }
            }
            q.poll();
        }
        System.out.println(count);
    }
}
