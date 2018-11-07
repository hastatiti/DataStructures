package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Stack;

public class Ex11 {
	static Stack<String> stack = new Stack<String>();

	public static String evaluate(String str) {
		for(String s : str.split(" ")) {
			if(s.equals("("))
			{
			}
			else if(s.equals(")")) {
				String a = stack.pop();
				String b = stack.pop();
				String c = stack.pop();
				double no1 = Double.parseDouble(b);
				double no2 = Double.parseDouble(c);
			
				double together = 0.0;
				if(a.equals("+"))
					together = no1 + no2 ;  
				if(a.equals("-"))
					together = no2 - no1 ;  
				if(a.equals("*"))
					together = no1 * no2 ;  
				String total = Double.toString(together);
				stack.push(total);
			}
			else stack.push(s);
	}
		//It is just one value returned by String together
		return stack.pop();
	}
	public static void main(String[] args) {
		String str = "( ( 1 2 + ) ( ( 6 4 - ) ( 8 6 - ) * ) * )";
		System.out.println(evaluate(str));
	}
}
