package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex18 {
	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);
		//if "+a" was not present, 
		//than it will print 0 as b always evaluates to 0 recursively
		return mystery(a + a, b / 2) + a;
	}

	public static void main(String[] args) {
		System.out.println(mystery(2, 15));
	//	System.out.println(mystery(3, 11));
	}
}
