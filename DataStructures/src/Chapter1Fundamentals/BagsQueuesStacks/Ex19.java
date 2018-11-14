package Chapter1Fundamentals.BagsQueuesStacks;


public class Ex19<Item> {
	 private Node first; // top of stack (most recently added node)
	   private int N; 
	   private class Node { // nested class to define nodes
			Item item;
			Node next;
		}
	   public void removeLast() {
		   for (Node x = first; x != null; x = x.next) {
			   if(x.next == null) {
				   x = null;
			   }
		   }
	   }
}
