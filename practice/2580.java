import java.util.*;

public class Main{
    public static int[][] arr = new int[9][9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        number(0, 0);
        
}
    public static void number(int x, int y){
        if(y==9){
            number(x+1, 0);
            return;
        }
        if(x==9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if(arr[x][y]==0){
            for(int i=1; i<=9; i++){
                if(location(x, y, i)==true){
                    arr[x][y] = i;
                    number(x, y+1);
                }
            }
            arr[x][y] = 0;
            return;
        }
        number(x, y+1);
    }
    public static boolean location(int x, int y, int k){
        for(int i=0; i<9; i++){
            if(arr[i][y]==k){
                return false;
            }
            else if(arr[x][i]==k){
                return false;
            }
        }
        int threex = (x/3) * 3;
        int threey = (y/3) * 3;
        for(int j=threex; j<threex+3; j++){
            for(int q=threey; q<threey+3; q++){
                if(arr[j][q]==k){
                    return false;
                }
            }
        }
        return true;
    }
}
