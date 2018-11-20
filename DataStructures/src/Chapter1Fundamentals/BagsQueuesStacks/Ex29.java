package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Iterator;

public class Ex29<Item> implements Iterable<Item> {
	private Node last; 
	private int N; // number of items on the queue
	private class Node { // nested class to define nodes
		Item item;
		Node next;}
	public boolean isEmpty() {
		return N == 0;} 
	public int size() {
		return N;}
	
	public void enqueue(Item item) { // Add item to the end of the list
		 if (isEmpty()) {
			 last = new Node();
			 last.next = last;
		 }else {
			 Node newNode = new Node();
			 last.next = newNode;
			 newNode.next = last;
		 }
	      N++;
	}

//	public Item dequeue() { // Remove item from the beginning of the list.
//		Item item = first.item;
//		first = first.next;
//		if (isEmpty())
//			last = null;
//		N--;
//		return item;
//	}

	@Override
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}

	private class QueueIterator implements Iterator<Item> {
		private Node current = last;
		int k = 0;
		@Override
		public boolean hasNext() {
			return k < N;
		}

		@Override
		public Item next() {
			k++;
			Item item = current.item;
			current = current.next;
			return item;
			
		}
	}
	public static void main(String[] args) {
		Ex29<String> q = new Ex29<>();
		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		q.enqueue("d");
		for(String s : q) {
			System.out.println(s);
		}
	}
}
