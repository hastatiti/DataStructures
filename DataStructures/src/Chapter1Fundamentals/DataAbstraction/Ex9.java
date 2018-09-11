package Chapter1Fundamentals.DataAbstraction;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	public static int rank(int key, int[] a, int lo, int hi,Counter c) {
		int mid = (lo + hi) / 2;
		
		c.increment();
		System.out.println("lo is: " + lo + " mid is : " + mid  + " hi is: " + hi);
		if (lo > hi) return -1;
		if (key == a[mid]) return mid;
		else if (key < a[mid]) return rank(key, a, lo, mid-1,c);
		else return rank(key, a, mid+1, hi, c);
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		Arrays.sort(a);
		Counter c = new Counter("myCounter");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int key = sc.nextInt();
		rank(key, a, 0, a.length-1,c);
		System.out.println("key is : " + key);
		System.out.println("Number of total searches are : " +c.tally());}
	}
}
