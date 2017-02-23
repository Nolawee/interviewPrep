import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static class MyQueue<T> {
    private Stack<T> stackNewestOnTop = new Stack<T>();
    private Stack<T> stackOldestOnTop = new Stack<T>(); // contain items in opposite order

    public void enqueue(T value) { // add item
      stackNewestOnTop.push(value);
    }

    public T peek() { // return oldest item
      // move elements from stackNewest to stackOldest
      return stackOldestOnTop.peek();
    }

    private void shiftStacks(){
      if(stackOldestOnTop.isEmpty()){
        while (!stackNewestOnTop.isEmpty()) {
          stackOldestOnTop.push(stackNewestOnTop.pop());
        }
      }
    }

    public T dequeue(){ //return and delete oldest item
      // move elements from stackNewest to stackOldest
      shiftStacks();
      return stackOldestOnTop.pop();
    }
  }
}
