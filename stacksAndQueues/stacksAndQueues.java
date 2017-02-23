public static class Queue {
  public static class Node {
    private int data;
    private Node next;
    private Node(int data) {
      this.data = data;
    }
  }
  private Node head; // remove from head
  private Node tail; // add things here

  public boolean isEmpty(){
    return head==null;
  }

  public int peek(){
    if(head == null){
      return -1;
    }
    return head.data;
  }
  public void add(int data){
    Node node = new Node(data);
    if (tail != null) { // if queue has some tail (more than one element)
      tail.next = node;
    }
    if (head == null) {
      head = node;
    }

  }

  public int remove() {
    int data = head.data;
    head = head.next;
    if (head == null) { // if the delete creates an empty queue
      tail = null;
    }
    return data
  }
}

public static class Stack {
  public static class Node {
    private int data;
    private Node next;
    private Node(int data) {
      this.data = data;
    }
  }
  private Node top; // add and remove from top

  public boolean isEmpty(){
    return top == null;
  }

  public int peek(){
    if (top == null) {
      return -1;
    }
    return top.data;
  }

  public void push(int data){
    if(top == null) {
      top.data = data;
      return;
    } else {
      Node node = new Node(data);
      node.next = top
      top = node;
    }
  }


  public int pop()
    if (top == null) {
      return -1;
    }
    int data = top.data;
    top = top.next;
    return data;
  }


}
