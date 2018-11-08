package Chapter1Fundamentals.BagsQueuesStacks;

import Chapter1Fundamentals.BagsQueuesStacks.Stack;;

public class Ex12{
	public static Stack<String> copy(Stack<String> stack){
		Stack<String> copyStack = new Stack<String>();
		
		for(String s : stack) {
			copyStack.push(s);
		}
		
		return copyStack;
	}
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		Stack<String> copyStack = new Stack<String>();
		myStack.push("a");
		myStack.push("b");
		myStack.push("c");
		copyStack = copy(myStack);
		for(String s : copyStack) {
			System.out.println(s);
		}
	}
}