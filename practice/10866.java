import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str;
        Deque<Integer> q = new LinkedList<Integer>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            str = new StringTokenizer(br.readLine(), " ");
            switch(str.nextToken()){
                case "push_front":
                    int m = Integer.parseInt(str.nextToken());
                    q.addFirst(m);
                    break;
                case "push_back":
                    int a = Integer.parseInt(str.nextToken());
                    q.addLast(a);
                    break;
                case "pop_front":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.removeFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.removeLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
