// if the fast and slow nodes collide then the list has a cycle
boolean hasCycle(Node head){
  if(head == null) return false;
  Node fast = head.next;
  Node slow = head;
  while (fast != null && fast.next != null && slow!= null){
    if(fast == slow){
      return true; // found a collision
    }
    fast = fast.next.next; //moves 2 jumps
    slow = slow.next; //moves one jump
  }
  return false;
}
