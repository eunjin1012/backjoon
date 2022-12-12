import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int floor=1;
        while(true){
        if(count+floor>=n){
            break;
        }
        count = count+floor;
        floor++;
        }
        
        int s = n-count;
        
        if(floor%2==0){
            System.out.println(s+"/"+(floor-s+1));
        }
        else{
            System.out.println((floor-s+1)+"/"+s);
        }
        
    }
}
