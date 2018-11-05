package Chapter1Fundamentals.DataAbstraction;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		int counter = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			counter++;
			System.out.println(counter);
		}
		in.close();
		String[] s = new String[counter];
		System.out.println(s.length);
	}
}
