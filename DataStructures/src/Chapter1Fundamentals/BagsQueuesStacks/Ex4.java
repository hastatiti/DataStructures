package Chapter1Fundamentals.BagsQueuesStacks;

import java.util.Stack;

public class Ex4 {
	public static boolean doParanthesesMatch(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i<str.length(); i++) {
			char current = str.charAt(i);
			if(current == '{' || current == '[' || current == '(' ) 
				stack.push(current);
			
			if(current == '}' || current == ']' || current == ')' ){
				char topElement = stack.pop();
				if(topElement != '{' && current=='}' || topElement != '[' && current==']' && topElement != '(' && current==')')
					return false;
		}
	}
		return true;
}
	public static void main(String[] args) {
		System.out.println("Match : " + doParanthesesMatch("{[()]}()"));
		System.out.println("Match : " + doParanthesesMatch("{(})"));
	}
}