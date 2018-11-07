package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Stack;

public class Ex10 {
	static Stack<String> ops = new Stack<String>();
	static Stack<String> vals = new Stack<String>();
	
	public static String infixToPostfix(String str) {
		for(String s : str.split(" ")) {
			if(s.equals("(") || s.equals("+") || s.equals("-") || s.equals("*"))
				ops.push(s);
			else if(s.equals(")")) {
				String c = vals.pop();
				String b = ops.pop();
				String a = vals.pop();
				String together = " ( " + a + " " + c + " " + b + " ) ";  
				vals.push(together);
			}
			else vals.push(s);
	}
		//It is just one value returned by String together
		return vals.pop();
	}
	public static void main(String[] args) {
		String str = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
		System.out.println(infixToPostfix(str));
	}
}
