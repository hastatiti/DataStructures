package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Stack;

public class Ex5 {
	public static void main(String[] args) {
		int N = 50;
		Stack<Integer> stack = new Stack<Integer>();
		while (N > 0) {
			stack.push(N % 2);
			N = N / 2;
		}
			while(!stack.isEmpty())
			System.out.print(stack.pop());
	}
}
