import java.util.*;
import java.math.*;

public class Main{
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int m = (int)Math.pow(2, n);
        recuir(r, c, m);
        System.out.println(count);
    }
    public static void recuir(int a, int b, int size){
        int newsize = size/2;
        if(size==1){
            return;
        }
        else if(a<newsize && b<newsize){
            recuir(a, b, newsize);
        }
        else if(a<newsize && b>=newsize){
            count += (size * size)/4;
            recuir(a, b-newsize, newsize);
        }
        else if(a>=newsize && b<newsize){
            count += ((size*size)/4) * 2;
            recuir(a-newsize, b, newsize);
        }
        else{
            count += ((size*size)/4) * 3;
            recuir(a-newsize, b-newsize, newsize);
        }
    }
}
