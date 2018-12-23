package org.ra.practise.sorting;

/**
 * 
 * @author Piyush
 * 
 * Bubble Sort:
 * 1) Bubble sort starts with very first two elements, comparing them to check which one is greater
 * [{12, 4}, 22, 90, 5]
 * 2) As 12 is greater than 4, replace the indices. Next, compare 12 with 22
 * [4,{12, 22}, 90, 5]
 * 3) As 22 is greater than 12, we will not replace it. Next, compare 22 with 90 and in this case as well
 * 		we will not replace. At the end, we will check for 90 and 5.
 * [4,12, 22, {90, 5}]
 * 4) As 90 is greater than 5, we will replace. In this way, we will get 90 as the highest number at the extreme right.
 * [4,12, 22, 5, 90]
 * 5) This way we will do the same to get the next highest number at the right
 * 
 * Example Below,
 * Input Array :[12, 4, 22, 90, 5]
 * Array After Iteration 1:[4, 12, 22, 5, {90}]
 * Array After Iteration 2:[4, 12, 5, {22, 90}]
 * Array After Iteration 3:[4, 5, {12, 22, 90}]
 * Array After Iteration 4:[4, {5, 12, 22, 90}]
 * Array After Iteration 5:[4, 5, 12, 22, 90]
 * Output Array:[4, 5, 12, 22, 90]
 */
public class BubbleSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,4,22,90,5};
		System.out.println("Input Array :" + java.util.Arrays.toString(array));
		array = performBubbleSort(array);
		System.out.println("Output Array:" + java.util.Arrays.toString(array));
	}
	
	private static int[] performBubbleSort(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length-i; j++) {
				if(input[j-1]>input[j]) {
					int temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}
			}
			System.out.println("Array After Iteration " + (i+1) + ":" +  java.util.Arrays.toString(input));
		}
		return input;
	}

}
