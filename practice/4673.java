public class Main{
    public static void main(String[] args) {
        boolean[] number = new boolean[10001];
        for(int i=1; i<10001; i++){
            int a = self(i);
            if(a<10001){
                number[a] = true;
            }
            
        }
        for(int j=1; j<10001; j++){
            if(number[j]==false){
                System.out.println(j);
            }
        }
  }
    public static int self(int n){
        int sum=n;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
