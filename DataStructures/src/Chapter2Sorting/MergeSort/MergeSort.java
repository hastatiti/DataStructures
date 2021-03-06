package Chapter2Sorting.MergeSort;

public class MergeSort extends GeneralSort {
	public static Comparable[] aux; 
	 public static void merge(Comparable[] a, int lo, int mid, int hi)
	  {  // Merge a[lo..mid] with a[mid+1..hi].
	     int i = lo, j = mid+1;
	     for (int k = lo; k <= hi; k++)  // Copy a[lo..hi] to aux[lo..hi].
	        aux[k] = a[k];
	     for (int k = lo; k <= hi; k++)  // Merge back to a[lo..hi].
	        if      (i > mid)              a[k] = aux[j++];
	        else if (j > hi )              a[k] = aux[i++];
	        else if (less(aux[j], aux[i])) a[k] = aux[j++];
	        else                           a[k] = aux[i++];
	}
	 public static void sort(Comparable[] a)
     {
        aux = new Comparable[a.length];    // Allocate space just once.
        sort(a, 0, a.length - 1);
     }
	 public static void sort(Comparable[] a, int lo, int hi)
     {  // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);       // Sort left half.
        sort(a, mid+1, hi);     // Sort right half.
        merge(a, lo, mid, hi);  // Merge results
}
	 public static void main(String[] args) {
		 Comparable [] a = {1,5,4,2};
		 sort(a);
		 show(a);
	}
}
