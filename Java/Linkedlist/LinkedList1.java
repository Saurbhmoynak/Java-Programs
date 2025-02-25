package Linkedlist;

//creating linkedList class that will manage all linkedlist operations
class LinkedList {
   
  private Node head;

  //creating node class
  private class Node {
    String data;
    Node next;

    public Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  //Constructors are particularly useful for initializing instance variables or performing any setup that needs to be done before the object can be used.
  //The constructor public LinkedList() initializes the head node of the linked list to null. This is a crucial step when creating a new instance of the LinkedList class, as it ensures that the linked list starts off as empty.
  public LinkedList() {
    this.head = null;
  }

  
  public void addFirst(String data) {
    Node newNode = new Node(data);
    //if head id null then assign head to newNode
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }

  public void addLast(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    head = head.next;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }

    secondLast.next = null;
  }


  public void reverseList() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node prev = null;
    Node curr = head;
    Node next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void reverseRecursive() {
    head = reverseRecursiveHelper(head);
  }


  public Node reverseRecursiveHelper(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node newHead = reverseRecursiveHelper(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
  }
  
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node currNode = head;
    while (currNode!= null) {
      System.out.print(currNode.data + " --> ");
      currNode = currNode.next;
    }

    System.out.println("NULL");
  }


}

public class LinkedList1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addFirst("a");
    list.addFirst("s");
    list.addLast("u");
    list.addLast("r");
    list.addLast("b");
    list.addLast("h");

    list.printList();

    list.reverseList();
    list.printList();

    list.reverseRecursive();
    list.printList();
  }
}
