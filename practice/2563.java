import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int[][] paper = new int[100][100];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int x=a; x<a+10; x++){
                for(int y=b; y<b+10; y++){
                    paper[x][y]=1;
                }
            }
        }
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    if(paper[i][j]==1){
                        count++;
                    }
                } 
        }
        System.out.println(count);
    }
}
