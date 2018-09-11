package Chapter1Fundamentals.BasicProgrammingModel;
import java.util.Arrays;

public class Ex30 {
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		System.out.println("Now checking for : " + p +" and " + q);
		return gcd(q, r);
	}

	public static void main(String[] args) {
		int[][] array = new int [10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = gcd(i,j);
				System.out.println(gcd(i,j));
			}
		}
		
	}

}
