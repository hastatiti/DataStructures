package Chapter1Fundamentals.BasicProgrammingModel;

public class Fibonacci {
	//starts wit 0
	static int fibResursive(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibResursive(n - 1) + fibResursive(n - 2);
	}
	//starts with 1
	static int fibKingsCollegeRecursive(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		
		return fibKingsCollegeRecursive(n-1) + fibKingsCollegeRecursive(n-2);
	}

	// fibonacci starts with 0
	static int fibIterative(int n) {
		int fib = 0;
		int a = 1;
		for (int i = 0; i < n; i++) {
			int temp = fib;
			fib = fib + a;
			a = temp;
		}
		return fib;
	}

	// fibonacci starts with 0
	static int fibKingsCollegeIterative2(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 & n == 2) {
			return 1;
		}
		int previous = 0;
		int current = 1;
		int next;
		for (int i = 2; i <= n; i++) {
			next = current + previous;
			previous = current;
			current = next;
		}
		return current;
	}

	// fibonacci starts with 1
	static int fibKingsCollegeIterative(int n) {
		int previous = 0;
		int current = 1;
		int next;
		for (int i = 0; i < n; i++) {
			next = current + previous;
			previous = current;
			current = next;
		}
		return current;
	}

	public static void main(String[] args) {
		// System.out.println(fibResursive(4));
		// System.out.println(fibIterative(4)); //starts with 0
		System.out.println(fibKingsCollegeIterative(5)); // with 1
		System.out.println(fibKingsCollegeRecursive(5)); //with 1
		// System.out.println(fibKingsCollegeIterative2(3)); //with 0
	}
}
