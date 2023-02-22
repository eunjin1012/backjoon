import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==-1){
                break;
            }
            ArrayList<Integer> list = new ArrayList<Integer>();
            int total = 0;
            for(int i=1; i<n; i++){
                if(n%i==0){
                    total+=i;
                    list.add(i);
                }
            }
            if(total==n){
                System.out.print(n + " = " + list.get(0));
                for(int i=1; i<list.size(); i++){
                    System.out.print(" + ");
                    System.out.print(list.get(i));
                }
                System.out.println();
            }
            else{
                System.out.println(n+" is NOT perfect.");
            }
        }
    }
}
