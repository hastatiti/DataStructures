package Chapter1Fundamentals.BasicProgrammingModel;

public class ReverseArray {
	public static void main(String[] args) {
	int[] array = new int[] { 3, 7, 4, 9, 5, 6, 8, 1, 20, 2 };
	int[] reverse = new int[array.length];
	
	System.out.println("reverse of an array : ");
	for(int i = array.length-1; i >= 0; i--) {
			reverse[i] =  array[i];
			System.out.print(reverse[i] + " ");
		}
		
	}
}
