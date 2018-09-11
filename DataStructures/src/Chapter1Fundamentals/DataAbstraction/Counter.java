package Chapter1Fundamentals.DataAbstraction;

import java.util.Scanner;

public class Counter {
	private final String name;
	private int count;

	public Counter(String id) {
		name = id;
	}
	public void increment() {
		count++;
	}
	public int tally() {
		return count;
	}
	public String toString() {
		return count + " " + name;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Counter c = new Counter("a");
		for(int i =0; i<N; i++) {
			c.increment();
	}	System.out.println(c.tally());	}
}
