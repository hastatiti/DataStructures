package Chapter1Fundamentals.DataAbstraction;

public class Ex7 {
	public static String mystery(String s)
    {
       int N = s.length();
       if (N <= 1) return s;
       String a = s.substring(0, N/2);
       String b = s.substring(N/2, N);
       return mystery(b) + mystery(a);
}
	public static void main(String[] args) {
		System.out.println(mystery("dere"));
	}
}
