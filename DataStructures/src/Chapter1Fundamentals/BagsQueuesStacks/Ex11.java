package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Stack;

public class Ex11 {
	static Stack<String> ops = new Stack<String>();
	static Stack<String> vals = new Stack<String>();
	
	public static String evaluate(String str) {
		for(String s : str.split(" ")) {
			if(s.equals("("))
			{}
			else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
				ops.push(s);
			else if(s.equals(")")) {
				String operator = ops.pop();
				String b = vals.pop();
				String a = vals.pop();
				double no1 = Double.parseDouble(b);
				double no2 = Double.parseDouble(a);
			
				double together = 0.0;
				if(operator.equals("+"))
					together = no1 + no2 ;  
				if(operator.equals("-"))
					together = no2 - no1 ;  
				if(operator.equals("*"))
					together = no1 * no2 ;  
				String total = Double.toString(together);
				vals.push(total);
			}
			else vals.push(s);
	}
		//It is just one value returned by String together
		return vals.pop();
	}
	public static void main(String[] args) {
		String str = "( ( 1 2 + ) ( ( 6 4 - ) ( 8 6 - ) * ) * )";
		System.out.println(evaluate(str));
	}
}
