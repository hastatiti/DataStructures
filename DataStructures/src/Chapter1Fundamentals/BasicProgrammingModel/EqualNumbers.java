package Chapter1Fundamentals.BasicProgrammingModel;
import java.util.Scanner;

public class EqualNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int num = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter " + (i + 1) + " number : ");
			a[i] = in.nextInt();
			if (a[0] != a[i]) {
				System.out.println("Numbers are not equal");
				
			} 
			 
		}//end of for loop
		System.out.println("Numbers are equal");
			
		}
}
