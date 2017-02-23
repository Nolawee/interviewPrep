import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static int getRegionSize(int[][] matrix, int row, int column) {
    if(row<0 || column < 0 || row >= matrix.length || column >= matrix[row].length) {
      return 0;
    }
    if(matrix[row][column] == 0) {
      return 0;
    }
    int size = 1;
    matrix[row][column] = 0;
    for(int r = row - 1; r <= row + 1; r++){
      for(int c = column - 1; r <= column + 1; c++){
        if(r != row || c != column){
            size += getRegionSize(matrix, r, c);
        }
      }
    }
    return size;
  }
  public static int getBiggestRegion(int[][] matrix) {
    int maxRegion = 0;

    for(int row = 0; row < matrix.length; row++){
      for(int column = 0; row < matrix[row].length; column++) {
        if(matrix[row][column] == 1) {
          int size = getRegionSize(matrix, row, column);
          maxRegion = Math.max(size, maxRegion);
        }
      }
    }
    return maxRegion;
  }

}
