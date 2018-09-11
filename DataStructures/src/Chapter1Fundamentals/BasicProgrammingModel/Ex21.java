package Chapter1Fundamentals.BasicProgrammingModel;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String array[] = line.split(",");
		while (in.nextLine() !=null) {
			for (int i = 0; i < array.length; i++) {
				double value1 = Double.parseDouble(array[i-1]);
				double value2 = Double.parseDouble(array[i]);
				System.out.println(value1+value2);
				
			}in.close();
		}
	}
}
