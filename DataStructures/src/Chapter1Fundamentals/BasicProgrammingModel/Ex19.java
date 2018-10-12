package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex19 {
	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	// iterative approach
	public static long fibonacci(long n) {
		int previous = 0;
		int current = 1;
		int next;
		for(int i=0; i<n; i++) {
			next = current + previous;
			previous = current;
			current = next;
		}
		return current;
	}

	public static void main(String[] args) {
//		for (int N = 0; N < 100; N++)
//			System.out.println(N + " " + F(N));
		 System.out.println(fibonacci(100));
	}
}
