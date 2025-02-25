package MyStack;

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Stack {
  public Node head;

  public Stack() {
    this.head = null;
  }
  
  public boolean isEmpty() {
    return head == null;
  }

  public void push(int data) {
    Node newNode = new Node(data);

    if (isEmpty()) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }
  
  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }

    int topValue = head.data;
    head = head.next;
    return topValue;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }

    int topValue = head.data;
    return topValue;
  }
}

public class LinkedStack {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.pop();
  }
}
