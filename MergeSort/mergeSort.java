import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void mergesort(int[] array) {
    mergersort(array, new int[array.length], 0, array.length - 1)
  }

  public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
    if (leftStart >= rightEnd) {
      return;
    }
    int middle = (leftStart + rightEnd) / 2;
    mergesort(array, temp, leftStart, middle);
    mergesort(array, temp, middle + 1, rightEnd);
    mergeHalves(array, temp, leftStart, rightEnd);
  }

  public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
    int leftEnd = (rightEnd + leftStart)/2;
    int rightStart = leftEnd+1;
    int size = rightEnd - leftStart + 1;

    int left = leftStart;
    int right = rightStart;
    int index = leftStart;

    while (left <= leftEnd&& right <= rightEnd){
      if(array[left] <= array[right]) {
        temp[index] = array[left];
        index++;
        temp++;
      } else {
        temp[index] = array[right];
      }
      index++;
    }

    System.arraycopy(array, left, temp, index, leftEnd - left + 1);
    System.arraycopy(array, right, temp, index, rightEnd - right + 1);
    // either left or right pointer is at end, so only one of these two lines 
    // will have an effect
    System.arraycopy(tem, leftStart, array, leftStart, size);
  }
}
