public class Node {
  Node next;
  int data;
  public Node(int data) {
    this.data = data;
  }
  public void append(int data) {
    Node current = this;
    While (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }
}

public class LinkedList {
  Node head;
  public void append(int data){
    if(head == null){
      head new Node(data);
      return;
    }
    Node current = head;
    While (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }

  public void prepend(int data) {
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  public void deleteWithValue(int data) {
    if (head == null) return;
    if(head.data == data){ // deleted value is head
      head = head.next;
      return;
    }
    Node current = head;
    while(current != null) { // walk through linked list until find value to delete
      if(current.next.data = data){
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }
}
