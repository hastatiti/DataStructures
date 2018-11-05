package Chapter1Fundamentals.BagsQueuesStacks;

public class Ex1 {
	private String[] a; // stack entries
	private int N; // size

	public Ex1(int cap) {
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
		Ex1 fixedStack = new Ex1(2);
		System.out.println("isEmpty : " + fixedStack.isEmpty());
		System.out.println("isFull : " + fixedStack.isFull());
		System.out.println("a added");
		fixedStack.push("a");
		System.out.println("isEmpty : " + fixedStack.isEmpty());
		System.out.println("isFull : " + fixedStack.isFull());
		System.out.println("b added");
		fixedStack.push("b");
		System.out.println("isEmpty : " + fixedStack.isEmpty());
		System.out.println("isFull : " + fixedStack.isFull());
	}
	
}
