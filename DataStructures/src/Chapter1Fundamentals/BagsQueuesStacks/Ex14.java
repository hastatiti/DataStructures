package Chapter1Fundamentals.BagsQueuesStacks;

public class Ex14 {
	private String[] a; // stack entries
	private int N; // size

	public Ex14(int cap) {
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
}
