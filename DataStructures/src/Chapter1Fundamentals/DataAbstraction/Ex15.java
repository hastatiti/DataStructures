package Chapter1Fundamentals.DataAbstraction;

import java.util.Scanner;

public class Ex15 {
	public static void  readInts(String name) {
		int [] ints;
		int counter = 0;
		for(String str : name.split(" ")) {
			counter++;
		}
		ints = new int[counter];
			for(String s : name.split(" ")) {
				int i = 0;
				System.out.println(ints[i++] = Integer.parseInt(s));
			}
	}
	
	public static void main(String[] args) {
		readInts("1 2 3");
}
}