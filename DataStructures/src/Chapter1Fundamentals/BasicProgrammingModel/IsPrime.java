package Chapter1Fundamentals.BasicProgrammingModel;

public class IsPrime {
	// prime numbers 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...
	public static boolean primeTest(int a) {
		if (a < 2)
			return false;
		for (int i = 2; i < a; i++) {
			System.out.println(a + "/" + i);
			if (a % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(primeTest(11));
	}
}
