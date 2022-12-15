import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] st = new String[n];
        for(int i=0; i<n; i++){
            String s = sc.next();
            st[i] = s;
        }
        Arrays.sort(st, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length()-s2.length();
                }
            }
        });
        System.out.println(st[0]);
        for(int i=1; i<n; i++){
            if(!st[i].equals(st[i-1])){
                System.out.println(st[i]);
            }
        }
        
    }
}
