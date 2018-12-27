package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Iterator;


public class Ex20<Item> implements Iterable<Item> {
	 private Node first; // top of stack (most recently added node)
	   private int N; 
	   private class Node { // nested class to define nodes
			Item item;
			Node next;
		}
	   public int size()        {  return N; }
	   public boolean isEmpty() {  return first == null; }
	  
	   public void add(Item item)
	   {  // Add item to top of LinkedList.
	      Node oldfirst = first;
	      first = new Node();
	      first.item = item;
	      first.next = oldfirst;
	      N++;
	}
	   public void removeLast() {
		   if(N == 1 ) first = null;
		   for (Node x = first; x != null; x = x.next) {
			   if(x.next.next == null) {
				   x.next = null;
			   }
		   }
		   N--;
	   }
	   public void delete(int k) {
		   if(k > N || isEmpty()) throw new RuntimeException("LinkedList is too small");
		   int count = 0;
		   if(k==1) first = first.next;
		   for (Node x = first; x != null; x = x.next) {
			   count++;
			   if(count == k-1) {
				   x.next = x.next.next;
			   }
		   }
	   }
	   @Override
	   public Iterator<Item> iterator() {
	   	return new ListIterator();
	   }
	   	private class ListIterator implements Iterator<Item> {
	   		private Node current = first;

	   		public boolean hasNext() {
	   			return current != null;
	   		}
	   		public Item next() {
	   			Item item = current.item;
	   			current = current.next;
	   			return item;
	   		}
	   	}
	   	public static void main(String[] args) {
		Ex20<String> list = new Ex20<>();
		list.add("c");
		list.add("b");
		list.add("a");
		//list.removeLast();
		list.delete(1);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
