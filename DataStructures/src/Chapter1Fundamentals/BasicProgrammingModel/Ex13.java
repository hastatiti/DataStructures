package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex13 {
	public static void main(String[] args) {

		int[][] intArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,8,9 } };
		for (int i = intArray.length-1 ; i >= 0; i--) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
		}
	}
} 