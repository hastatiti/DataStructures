package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.PriorityQueue;
import java.util.Stack;
import Chapter1Fundamentals.BagsQueuesStacks.*;

public class Ex6 {
	//Add elements of queue q to a stack
	//and vice versa
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		Stack<String> stack = new Stack<String>();
		while(!q.isEmpty())
			stack.push(q.dequeue());
			System.out.println("stack is : " + stack + " size of queue is : " + q.size());
		while(!stack.isEmpty())
			q.enqueue(stack.pop());
			System.out.println("stack is : " + stack + " size of queue is : " + q.size());
	}
	
}
