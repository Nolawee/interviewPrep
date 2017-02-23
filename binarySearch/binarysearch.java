import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static boolean binarySearchIterative(int[] array, int x) {
    if(left > right){ // bounds checking
      return;
    }
    int left = 0;
    int right = array.length - 1;
    while(left <= right){
      int mid = left + (right - left)/2;
      if(array[mid] == x) {
        return true;
      } else if (x < array[mid]) {
        right = mid -1
      } else {
        left = mid + 1
      }
    }
    return false;
  }

  public static boolean binarySearchRecrusive(int[] array, int x, int left, int right) {
    if(left > right){ // bounds checking
      return;
    }

    int mid = (left + right) / 2;
    /*avoiding integer overflow another way to define mid*/
    int mid = left + (right - left)/2;
    if(array[mid] == x) {
      return true;
    } else if (x < array[mid]) {
      return binarySearchRecrusive(array, x, left, mid-1);
    } else {
      binarySearchRecrusive(array, x, mid+1, right);
    }
  }

  public static void binarySearchRecrusive(int[] array, int x){
    return binarySearchRecrusive(array, x, 0, array.length-1);
  }
}
