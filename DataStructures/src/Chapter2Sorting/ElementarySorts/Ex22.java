package Chapter2Sorting.ElementarySorts;

import java.util.Arrays;
import java.util.Scanner;

public class Ex22 {
	public static Transaction[] readTransactions() {
		Scanner in = new Scanner(System.in);
			Transaction[] t = new Transaction[3];
			Date d  = new Date(2,2,2010);
			Transaction a = new Transaction("Mark",d,999);
			Transaction b = new Transaction("Adam",d,1123);
			Transaction c = new Transaction("Jack",d,35);
				t[0] = a;
				t[1] = b;
				t[2] = c;
				Arrays.sort(t);
				for(Transaction tr : t) {
					System.out.println(tr);
				}
		return t;
	}
	public static void main(String[] args) {
		readTransactions();
	}
}
