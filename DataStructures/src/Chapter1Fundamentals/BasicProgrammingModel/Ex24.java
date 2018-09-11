package Chapter1Fundamentals.BasicProgrammingModel;
import java.util.Scanner;

public class Ex24 {
	public static int gcd(int p, int q) {
		if(q == 0) return p;
		int r = p % q;
		System.out.println("Now checking for : " + p +" and " + q);
		return gcd(q,r);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		int no1 = in.nextInt();
		int no2 = in.nextInt();
		System.out.println(gcd(no1, no2));
		System.out.println(gcd(105,24));
	}
}
