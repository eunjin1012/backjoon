import java.util.*;

public class Main {
    public static int n, m;
    public static Queue<Integer> queue;
    public static int[] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
        m = sc.nextInt();
        if(n==m){
            System.out.println(0);
        }
        else{
            System.out.println(bfs(n));
        }
	}
    public static int bfs(int a){
        queue = new LinkedList<Integer>();
        check = new int[100001];
        queue.add(a);
        check[a] = 1;
        while(!queue.isEmpty()){
            int q = queue.poll();
            int[] location = {-1, 1, q};
            for(int i=0; i<3; i++){
                int number = q + location[i];
                if(number==m){
                    return check[q];
                }
                else if(number>=0 && number<100001){
                    if(check[number]==0){
                        queue.add(number);
                        check[number] = check[q] + 1;
                    }
                }
            }
        }
        return 0;
    }
}
