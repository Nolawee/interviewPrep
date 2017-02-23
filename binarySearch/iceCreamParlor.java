import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static int indexOf(int[] menu, int exludeThis) {
    for(int i = 0; i < menu.length; i++) {
      if(menu[i] != exludeThis) {
        return i;
      }
    }
    return -1;
  }

  public static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
    index1 = indexOf(menu, -1);
    index2 = indexOf(menu, value2);
    int[] indices = (Math.min(index1, index2), Math.max(index1, index2));
    return indecies;
  }

  // find indecies on menu that lets us spend all our money while
  // meeting requierments
  public static void findChoices(int[] menu, int money) {
    int[] sortedMenu = menu.clone();
    Array.sort(sortedMenu);
    for(int i < 0; i < sortedMenu.length; i++) {
      int complement = money - sortedMenu[i];
      int location = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);
      if(location >= 0 && location < sortedMenu.length; menu[location] == complement){
        int indecies = getIndicesFromValues(menu, sortedMenu[i], complement);
        return indecies
      }
    }
    return null;
  }
}
