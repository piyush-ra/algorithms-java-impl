package org.ra.practise.sorting;

/**
 * 
 * @author Piyush
 * 1) Example : [10,9,8,7,6]
 * Consider the 0th element is sorted and the remaining the unsorted. 
 * 
 * 2) [{10},9,8,7,6]
 * Try to add the first element of unsorted into the sorted array by comparing it with
 * every element in the sorted array. If smaller, move to the left.
 * Here, compare 9 with the sorted array [10]
 * 
 * 3) [{9,10},8,7,6]
 * Not compare 8 with 10 first. As it is smaller, replace it with 10. Now again compare it with 9,
 * replace as smaller.
 * 
 * 4) [{8,9,10},7,6]
 * Repeat the process. Compare 7 with the sorted array. Then compare 6 with the remaining sorted array
 * 
 * Input Array :[10, 9, 8, 7, 6]
 * Array After Iteration 1:[9, 10, 8, 7, 6]
 * Array After Iteration 2:[8, 9, 10, 7, 6]
 * Array After Iteration 3:[7, 8, 9, 10, 6]
 * Array After Iteration 4:[6, 7, 8, 9, 10]
 * Output Array:[6, 7, 8, 9, 10]
 * 
 */
public class InsertionSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,9,8,7,6};
		System.out.println("Input Array :" + java.util.Arrays.toString(array));
		array = performInsertionSort(array);
		System.out.println("Output Array:" + java.util.Arrays.toString(array));
	}

	private static int[] performInsertionSort(int[] input) {
		
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if(input[j]<input[j-1]) {
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
			System.out.println("Array After Iteration " + (i) + ":" +  java.util.Arrays.toString(input));
		}
		return input;
	}
}
