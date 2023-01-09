import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            LinkedList<int[]> q = new LinkedList<int[]>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            for(int j=0; j<a; j++){
                q.add(new int[] {j, sc.nextInt()});
            }
            while(!q.isEmpty()){
                int[] compare = q.poll();
                boolean bo = true;
                for(int[] p : q){
                    if(p[1]>compare[1]){
                        bo = false;
                    }
                }
                if(bo==true){
                    count++;
                    if(compare[0]==b){
                        break;
                    }
                }
                else{
                    q.add(compare);
                }
            }
            System.out.println(count);
        }
    }
}
