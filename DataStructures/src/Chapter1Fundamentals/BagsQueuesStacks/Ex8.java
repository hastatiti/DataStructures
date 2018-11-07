package Chapter1Fundamentals.BagsQueuesStacks;

public class Ex8 {
	private String[] a; // stack entries
	private int N; // size

	public Ex8(int cap) {
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
		String input = "it was - the best - of times - - - it was - the - -";
		Ex8 stackOfStrings = new Ex8(100);
		for(String str : input.split(" ")) {
			if(!str.equals("-") && !stackOfStrings.isFull()) {
				stackOfStrings.push(str);}
			else 
				if(!stackOfStrings.isEmpty())
				stackOfStrings.pop();
		}
		System.out.println("Size of stack is : " + stackOfStrings.size());
	}
}
