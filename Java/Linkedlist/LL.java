package Linkedlist;

import java.util.LinkedList;
public class LL {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    //adding elements
    list.addFirst(1);
    list.addLast(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 5);

    //printing list
    System.out.println(list);

    //accessing element by index
    int element = list.get(1);
    System.out.println("Element is "+ element);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" -> ");
    }
    System.out.println("null");

    //removing element

    list.remove(3);
    System.out.println(list);

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    System.out.println(list.size());
    System.out.println(list);
  }
  
}
