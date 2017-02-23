import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void quicksort(int [] array) {
		quicksort(array, 0, array.length -1);
	}

	public static void quicksort(int [] array, int left, int right){
		if (left >=right){
			return;
		}
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index-1); // left of the index
		quicksort(array, index, right); // right of the index
	}

	public static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			/*
			 * Look for element on left side bigger than pivot to swap and look for
			* element on right side smaller than pivot to swap
			*/
			while(array[left] < left) { // keep moving right (increment position)
				left++;
			}

			while(array[right] > right) { // keep moving left (decrement position)
				right--;

			}
			if (left <= right) { // where we swap
				swap(array, left, right);
				left++;
				right--;
			}
	}

	public static void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
		return left; //partition point
	}
