/*
 * A public class/object containing Advanced multi-method sorting algorithms
 * Contains: Merge Sort, Quick Sort
 * @author	Mike Poirier
 * @since	November 13, 2019
 */


public class AdvSort {

	public AdvSort () {
		// TODO: constructor
	}
	
	/**
	 * @method	Merge Sort
	 * @use 	A Divide and Conquer sorting algorithm:
	 * 			It divides input array in two halves,
	 * 			calls itself for the two halves and then merges the two sorted halves.
	 * 			Source: https://www.geeksforgeeks.org/merge-sort/
	 */
	
	public static int[] mergeSort (int[] unSorted) {
		int sorted[];
		int l, m, r;
		l = 0;
		r = unSorted.length;
		m = (l + r) / 2;
		
		sorted = merge(unSorted, l, m, r);
		return sorted;
	}
	
	// Recurisve merge sort method, called by mergeSort
	public static int[] merge (int[] arr, int l, int m, int r) {
		
		return null; 
	}
	
	
	/*
	 * Quick Sort
	 */
	
	public static int[] quickSort (int[] unSorted) {
		// TODO Quicksort
		
		return unSorted;
	}
	
}