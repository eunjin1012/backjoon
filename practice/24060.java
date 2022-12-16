import java.util.*;

public class Main{
    static int count = 0;
    static int k;
    static int score = -1;
    static int[] tmp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        tmp = new int[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        merge_sort(arr, 0, arr.length-1);
        System.out.println(score);
    }
    static void merge_sort(int[] A, int p, int r){
        if(p<r){
            int q = (p+r)/2;
            merge_sort(A, p, q);
            merge_sort(A, q+1, r);
            merge(A, p, q, r);
        }
    }
    static void merge(int[] A, int p, int q, int r){
        int i = p;
        int j = q+1;
        int t = 0;
        while(i<=q && j<=r){
            if(A[i]<=A[j]){
                tmp[t++] = A[i++];
            }
            else{
                tmp[t++] = A[j++];
            }
        }
        while(i<=q){
            tmp[t++] = A[i++];
        }
        while(j<=r){
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while(i<=r){
            count++;
            if(count==k){
                score = tmp[t];
                break;
            }
            else{
                A[i++] = tmp[t++];
            }
        }
    }
}
