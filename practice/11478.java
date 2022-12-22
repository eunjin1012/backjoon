import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<String> map = new HashSet<String>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(!map.contains(str.substring(i, j)))
                {
                    map.add(str.substring(i,j));
                }
            }
        }
        System.out.println(map.size());
    }
}
