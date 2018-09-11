package Chapter1Fundamentals.BasicProgrammingModel;

public class AverageArray {
	public static void main(String[] args) {
	int[] array = new int[] { 3, 7, 4, 9, 5, 6, 8, 1, 20, 2 };
	double sum = 0;
	for(int i = 0; i < array.length; i++) {
		sum += array[i];
	}
	double average = sum/array.length;
	System.out.println("Average is = " + average);
	int[] copy = new int[array.length];
	System.out.println("Copied array is : ");
	for(int i = 0; i < array.length; i++) {
		copy[i] = array[i];
		System.out.print(copy[i] + " ");
	}
	
}
}