import java.util.*;

public class FindIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] array = new int[size];

    //taking input
    System.out.println("Enter "+size+" values");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    System.out.println("Enter the element you want to search ");
    int number = sc.nextInt();

    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        System.out.println("Element at index" + i);
      }
    }
  }
}
