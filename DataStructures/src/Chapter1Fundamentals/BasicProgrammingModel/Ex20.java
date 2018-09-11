package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex20 {
	public static int ln(int n) {
		if (n <= 1)
			return 1;
		else 
			return n * ln(n - 1);
		
	}

	public static void main(String[] args) {
		System.out.println(ln(3));
	}
}
