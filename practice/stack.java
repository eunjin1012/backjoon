import java.util.*;
import java.io.*;

public class Main{
    public static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			switch (str) {
			case "push":
				int T = sc.nextInt();
				stack.push(T);
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}

	public static int pop() {
		if (stack.isEmpty()) {
			return -1;
		} else {
			int tmp = stack.peek();
			stack.pop();
			return tmp;
		}
	}

	public static int size() {
		return stack.size();
	}

	public static int empty() {
		if (stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int top() {
		if (stack.isEmpty()) {
			return -1;
		} else {
			return stack.peek();
		}
	}
}
