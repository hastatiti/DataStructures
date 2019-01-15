package Chapter2Sorting.MergeSort;

public class Ex6 extends MergeSort {
	private static Comparable[] aux; 
	static int counterTopDownMerge;
	static int counterBottomUpMerge;
	
	 public static void sort(Comparable[] a)
     {
        aux = new Comparable[a.length];    // Allocate space just once.
        sort(a, 0, a.length - 1);
       
     }
	 //top-down mergesort
	 public static void sort(Comparable[] a, int lo, int hi)
     {  // Sort a[lo..hi].
		 counterTopDownMerge++;
		 System.out.println("(" + lo + "," + hi + ")");
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);       // Sort left half.
        sort(a, mid+1, hi);     // Sort right half.
        merge(a, lo, mid, hi);  // Merge results
}
	 public static void merge(Comparable[] a, int lo, int mid, int hi)
	  {  // Merge a[lo..mid] with a[mid+1..hi].
	     int i = lo, j = mid+1;
	     for (int k = lo; k <= hi; k++)  // Copy a[lo..hi] to aux[lo..hi].
	        aux[k] = a[k];
	     for (int k = lo; k <= hi; k++)  // Merge back to a[lo..hi].
	     {
	    	 counterBottomUpMerge++;
	        if      (i > mid)              a[k] = aux[j++];
	        else if (j > hi )              a[k] = aux[i++];
	        else if (less(aux[j], aux[i])) a[k] = aux[j++];
	        else                           a[k] = aux[i++];
	}}
	 //bottom-up mergesort
	 public static void sort2(Comparable[] a)
     {  // Do lg N passes of pairwise merges.
		 
		 int N = a.length;
		 aux = new Comparable[N];
		 for (int sz = 1; sz < N; sz = sz+sz) // sz: subarray size
		 for (int lo = 0; lo < N-sz; lo += sz+sz) // lo: subarray index
		 merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
     }
	 
	 public static void main(String[] args) {
		 Comparable [] a = {1,5,8,2,88,11,5};
//		 sort(a);
//		 System.out.println("Number of array accesses for TopDownMerge are : " + counterTopDownMerge);
		 sort2(a);
		 System.out.println("Number of array accesses for BottomUpMerge are : " + counterBottomUpMerge);
	 }
}
