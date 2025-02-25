package QueueData;

class ArrayQueue {
  private int maxSize;
  private int front;
  private int rear;
  private int[] arrayQueue;
  private int nItems;

  public ArrayQueue(int size) {
    this.maxSize = size;
    arrayQueue = new int[size];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public boolean isFull() {
    return nItems == maxSize;
  }

  public boolean isEmpty() {
    return nItems == 0;
  }

  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }

    arrayQueue[++rear] = value;
    nItems++;
  }

  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is full");
      return -1;
    }

    int temp = arrayQueue[front];
    for (int i = 0; i < rear; i++) {
      arrayQueue[i] = arrayQueue[i + 1];
    }

    rear--;
    return temp;
  }


  public int peek() {
    if (isEmpty()) {
      System.out.println("Queue is full");
      return -1;
    }

    int temp = arrayQueue[front];
    return temp;
  }

}

public class ArrayQueueTest {
  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(6);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);

    while (!queue.isEmpty()) {
      System.out.println(queue.peek());
    }

    queue.dequeue();
    queue.dequeue();

  }

}
