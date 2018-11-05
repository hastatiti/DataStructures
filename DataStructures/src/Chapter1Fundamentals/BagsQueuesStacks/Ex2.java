package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Scanner;

public class Ex2 {
	private String[] a; // stack entries
	private int N; // size

	public Ex2(int cap) {
		a = new String[cap];
	}

	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean isFull() {
		return N == a.length;
	}
	
	public int size() {
		return N;
	}

	public void push(String item) {
		a[N++] = item;
	}

	public String pop() {
		return a[--N];
	}
	
	public static void main(String[] args) {
		Ex2 fixedStack = new Ex2(100);
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String item = in.next();
			if(!item.equals("-") && !fixedStack.isFull()) {
				System.out.println("item pushed is " + item); 
				fixedStack.push(item);}
			else if(!fixedStack.isEmpty())
			System.out.println("item popped is : " + fixedStack.pop() + " ");
		}
		System.out.println(fixedStack.size() + " left on the stack");
	}
}
