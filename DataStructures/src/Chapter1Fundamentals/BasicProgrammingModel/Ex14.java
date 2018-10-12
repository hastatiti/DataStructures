package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex14 {
	public static int lg(int N) {
		int bits = 0;
		while (N > 0) {
			N = N / 2;
			bits++;
		}
		return bits - 1;
	}

	public static void main(String[] args) {
		System.out.println(lg(10));
	}
}
