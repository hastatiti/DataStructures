package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex26 {
	
    public static void main(String[] args) {
    	int a=11;
    	int b=10;
    	int c=9;
    	int t=0;
    	if (a > b) { t = a; a = b; b = t; }
    	System.out.println(a + " " + b + " " +c);
        if (a > c) { t = a; a = c; c = t; }
    	System.out.println(a + " " + b + " " +c);
        if (b > c) { t = b; b = c; c = t; }
		System.out.println(a + " " + b + " " +c);
	}
}
