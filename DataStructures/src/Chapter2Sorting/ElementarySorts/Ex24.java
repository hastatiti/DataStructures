package Chapter2Sorting.ElementarySorts;

import java.util.Arrays;

public class Ex24 {
	 private static boolean less(Comparable v, Comparable w)
     {  return v.compareTo(w) < 0;  }
     private static void exch(Comparable[] a, int i, int j)
     {  Comparable t = a[i]; a[i] = a[j]; a[j] = t;  }
     private static void show(Comparable[] a)
     {  // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
        	System.out.println(a[i] + " ");
}
     public static boolean isSorted(Comparable[] a)
     {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
           if (less(a[i], a[i-1]))  return false;
        return true;
     }
     //Find minimum in array
     public static void findMin(Comparable[] a) {
    	 int N = a.length;
    	 Comparable min = a[0] ;
    	 Comparable temp; 
    	 int index = 0;
         for (int i = 1; i < N; i++) {
        	 if( a[i].compareTo(min) < 0) {
        		 min = a[i];
        		 index = i;
        	 }
         }
         for (int i = 0; i < N; i++) {
        	 temp = a[index];
        	 a[index] = a[0];
        	 a[0] = temp;
         }
         System.out.println(Arrays.toString(a));
     }
     //Insertion Sort 
     public static void sort(Comparable[] a)
     {  // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
           for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
              exch(a, j, j-1);
} }
     public static void main(String[] args) {
		String [] a = {"e","x","z","a","h","f"};
		findMin(a);
//		sort(a);
//		show(a);
	}
}
