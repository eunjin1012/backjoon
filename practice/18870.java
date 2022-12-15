import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr[i] = x;
            arr2[i] = x;
        }
        Arrays.sort(arr2);
        
        int count = 0;
        for(int j : arr2){
            if(!map.containsKey(j)){
                map.put(j, count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k : arr){
            int rank = map.get(k);
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}
