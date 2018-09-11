
public class MostFrequentNumber {
	public static int findMax(int[] myArray) {
		int counter = 0;
		int current = myArray[0];
		int maxValue = myArray[0];
		int maxCounter = -1;

		for (int element : myArray) {
			if (current == element) {
				counter++;
			}
			
			else {
				if (counter > maxCounter) {
					maxCounter = counter;
					maxValue = current;
				}
				counter = 0;
				current = element;
			}//end of else
		} // end of for loop

		if(counter > maxCounter) {
			maxValue = current;
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] myArray = { 7,7,7,7,7,7,1,2,1,1,4,1,1,4 };
		System.out.println(findMax(myArray));
	}
}
