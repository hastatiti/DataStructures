package Chapter1Fundamentals.BagsQueuesStacks;

public class Ex14 {
	private String[] a; // stack entries
	private int N; // size
	int k = 0; // index to get first item inserted FIFO
	
	public Ex14(int cap) {
		a = new String[cap];
	}

	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean isFull() {
		return N == a.length;
	}
	
	public void resize(int max) {
		String[] temp = new String[max];
		for(int i =0; i < N; i++) 
			temp[i] = a[i];
		a = temp;
		
	}
	
	public int size() {
		return N;
	}

	public void enqueue(String item) {
		if(N == a.length) resize(2*a.length);
		k = 0;
		a[N++] = item;
	}
	
	public String dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		--N;
		return a[k++];
	}
	
	public static void main(String[] args) {
		Ex14 resizingQueue = new Ex14(2);
		resizingQueue.enqueue("a");
		resizingQueue.enqueue("b");
		System.out.println("Queue is full : " + resizingQueue.isFull());
		System.out.println("Queue doubled in size");
		System.out.println("<--------------------------------->");
		resizingQueue.enqueue("c");
		System.out.println("Element added, Queue is full : " +resizingQueue.isFull());
		resizingQueue.enqueue("d");
		System.out.println("Element added, Queue is full : " +resizingQueue.isFull());
		System.out.println(resizingQueue.size());
		System.out.println(resizingQueue.dequeue());
		System.out.println(resizingQueue.dequeue());
		System.out.println(resizingQueue.dequeue());
		}
	
}
