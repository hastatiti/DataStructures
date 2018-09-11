package Chapter1Fundamentals.BasicProgrammingModel;
import java.util.Arrays;

public class Ex22 {
	public static int rank(int key, int[] a, int lo, int hi,int depth) {
		int mid = (lo + hi) / 2;
		for(int i=0; i<depth; i++) {
			System.out.println(" ");}
		System.out.println("lo is: " + lo + " hi is: " + hi);
		if (lo > hi) {
			return -1;
		}

		if (key == a[mid]) {
			return mid;
		}
		else if (key < a[mid]) {
			return rank(key, a, lo, mid-1, ++depth);
		}
		else  {
			return rank(key, a, mid+1, hi, ++depth);
		}
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		Arrays.sort(a);
		//System.out.println(rank(6, a, 0, a.length-1,0));
		rank(6, a, 0, a.length-1,0);
		
	}

}
