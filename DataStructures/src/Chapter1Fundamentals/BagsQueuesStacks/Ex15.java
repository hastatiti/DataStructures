package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Scanner;

public class Ex15 {
	
	public static void printElement (Queue<String> queue, int k) {
		int a = 0;
		for(String s : queue) {
			a++;
			if(k == a)
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		String input = "a b c d e f";
		Queue<String> queue = new Queue<>();
		
		for(String str : input.split(" ")) {
			queue.enqueue(str);
		}
			System.out.println("First element is (a expected): ");
			printElement(queue,1);
			System.out.println("Fifth element is (e expected) : ");
			printElement(queue,5);
	}
}
