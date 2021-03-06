package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Iterator;

public class Ex28<Item> implements Iterable<Item> {
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
	   public Node addNode(Item item) {
		    Node n = new Node();
		    n.item = item;
		    return n;
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
		   N--;
	   }
	   
	   public void removeAfter(Node n) {
		   for(Node x = first; x != null; x = x.next) {
			   if(x.item == n.item) {
				   x.next = x.next.next;
			   }
		   }N--;
	   }
	   public void insertAfter(Node n1, Node n2) {
		   for(Node x = first; x != null; x = x.next) {
			   if(x.item == n1.item) {
				   n2.next = x.next;
				   x.next = n2;
			   }
		   }N++;
	   }
	   public void remove(Ex28<String> list,String key) {
		   int counter =0;
		   for(String s : list) {
			   counter++;
			   if(s == key) {
				   delete(counter);
			   }
		   }
	   }
	   
//	   public int max() {
//		   int max = (int) first.item;
//		   int current ;
//		   for(Node x = first; x != null; x = x.next) {
//			   current = (int) x.item; 
//			   if(current > max) {
//				   max = current;
//			   }
//		   }
//		   return max;
//	   }
	   
	   //Recursive max
	   public int max() {
		   if(first == null)
			   return 0;
		   int max = (int) first.item;
		   return max(first , max);
	   }
	   public int max(Node node, int max) {
		   //base case
		   if(node == null)
			   return max;
		   if((int)node.item > max) {
			   max = (int)node.item;}
		return max(node.next , max) ;
	   }
	   
	   public static boolean find(Ex28<String> list,String key) {
		   for(String s : list) {
			   if(s == key) {
				   return true;
			   }
		   }
		   return false;
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
		Ex28<Integer> list = new Ex28<>();
		list.add(5);
		list.add(33);
		list.add(21);
		list.add(13);
		System.out.println("max is : " + list.max());
	}
}
