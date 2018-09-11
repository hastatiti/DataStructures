package Chapter1Fundamentals.DataAbstraction;

public class Ex5 {
	public static void main(String[] args) {
		String s = "Hello World";
	    s.toUpperCase();
	    s.substring(6, 11);
	    System.out.println(s); //immutable string s
	    System.out.println(s.substring(6, 11)); //s still refers same String
	    s=s.substring(6, 11);//s now refers to a different String
	    System.out.println(s);
	}
}
