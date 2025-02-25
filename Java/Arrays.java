import java.util.*;

public class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = sc.nextInt();
    //Array - method 1
    int[] array = new int[size];
    
    // //assigning values
    // array[0] = 91;
    // array[1] = 92;
    // array[2] = 93;
    // array[3] = 94;
    // array[4] = 97;
     System.out.println("Enter values");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }
}
