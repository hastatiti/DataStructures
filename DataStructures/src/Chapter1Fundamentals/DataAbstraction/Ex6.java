package Chapter1Fundamentals.DataAbstraction;

public class Ex6 {
	private static String nere;
	public static boolean isCircularShift(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		for(int i = 0; i<s1.length(); i++) {
			s1 = new StringBuilder(s1.substring(1)).append(s1.charAt(0)).toString();
			System.out.println(s1);
			if(s1.equals(s2)) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String s1="dere";
		String s2="rede";
		System.out.println(isCircularShift(s1,s2));
		
	}
}
