import java.util.*;

public class Main{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a==0 && b==0 && c==0){
                break;
            }
            if(a<c && b<c){
                if((a*a)+(b*b)==(c*c)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else if(a<b && c<b){
                if((a*a)+(c*c)==(b*b)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else{
                if((b*b)+(c*c)==(a*a)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
        }
        
        }
    }
