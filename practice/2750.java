import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            list.add(a);
        }
        Collections.sort(list);
        for(int j:list){
            System.out.println(j);
        }
    }
}
