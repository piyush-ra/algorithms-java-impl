package org.ra.practise.sorting;

/**
 * 
 * @author Piyush
 * 
 * Selection Sort:
 * 1) In an array of [0 to n], find the smallest
 * 2) replace 0th index with the smallest
 * 3) Now in a remaining array of [1 to n], find the smallest
 * 4) replace 1st index with the new smallest
 * 5) In this way, in every iteration the smallest element will be placed in the begining
 * 	Example Below, (smallest marked within {})
 * Input Array :[10, 3, 5, {2}, 88, 4, 8]
 * Array After Iteration 1:[{2}, 10, 5, {3}, 88, 4, 8]
 * Array After Iteration 2:[{2, 3}, 10, 5, 88, {4}, 8]
 * Array After Iteration 3:[{2, 3, 4}, 10, 88, {5}, 8]
 * Array After Iteration 4:[{2, 3, 4, 5}, 88, 10, {8}]
 * Array After Iteration 5:[{2, 3, 4, 5, 8}, 88, {10}]
 * Array After Iteration 6:[{2, 3, 4, 5, 8, 10}, {88}]
 * Array After Iteration 7:[{2, 3, 4, 5, 8, 10, 88}]
 * Output Array:[2, 3, 4, 5, 8, 10, 88]
 */
public class SelectionSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,3,5,2,88,4,8};
		System.out.println("Input Array :" + java.util.Arrays.toString(array));
		array = performSelectionSort(array);
		System.out.println("Output Array:" + java.util.Arrays.toString(array));

	}

	static int[] performSelectionSort(int[] inputArray) {
		int arrayLength = inputArray.length;
		
		for (int i = 0; i < arrayLength; i++) {
			int min_index = i;
			for (int j = i; j < inputArray.length; j++) {
				if(inputArray[j]<inputArray[min_index]) {
					// replace i with j value
					min_index = j;
				}
			}
			int temp = inputArray[i];
			inputArray[i] = inputArray[min_index];
			inputArray[min_index] = temp;
			System.out.println("Array After Iteration " + (i+1) + ":" +  java.util.Arrays.toString(inputArray));
		}
		
		return inputArray;
	}
}
