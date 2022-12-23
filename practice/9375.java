import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for(int j=0; j<n; j++){
                String cloth = sc.next();
                String kind = sc.next();
                map.put(kind, map.getOrDefault(kind, 0)+1);
            }
            int answer = 1;
            for(int k:map.values()){
                answer*=k+1;
            }
            System.out.println(answer-1);
        }
    }
} 
