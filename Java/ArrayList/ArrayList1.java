package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    //create an arraylist
    ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);

    System.out.println(arrayList);
    
    int element = arrayList.get(0);
    System.out.println(element);

    //adding element by index
    arrayList.add(1, 3);
    System.out.println(arrayList);

    //modifying the element
    arrayList.set(0, 5);
    System.out.println(arrayList);

    //remove element - by index
    arrayList.remove(1);
    System.out.println(arrayList);
g

  }
}
