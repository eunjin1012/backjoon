import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Deque<Integer> q = new LinkedList<Integer>();
        int b = 0;
        while(n-->0){
            str = new StringTokenizer(br.readLine(), " ");
            switch(str.nextToken()){
                case "push" :
                    int m = Integer.parseInt(str.nextToken());
                    q.add(m);
                    b = m;
                    break;
                case "pop" : 
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.poll()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(q.size()).append("\n");
                    break;
                case "empty" :
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(q.peek()).append("\n");
                    }
                    break;
                case "back" :
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(b).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
