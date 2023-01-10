import java.util.*;
import java.io.*;

public class Main{
    public static long mod = 1000000007;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        
        long up = factorial(n);
        long bottom = factorial(n-m) * factorial(m) % mod;
        
        System.out.println(up*pow(bottom, mod-2)%mod);
        
    }
    public static long factorial(long a){
        long f = 1L;
        while(a>1){
            f = (f*a)%mod;
            a--;
        }
        return f;
    }
    public static long pow(long x, long y){
        if(y==1){
            return x%mod;
        }
        long t = pow(x, y/2);
        if(y%2==1){
            return (t*t%mod)*x%mod;
        }
        else{
            return t*t%mod;
        }
    }
}
