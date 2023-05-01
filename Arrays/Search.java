package Arrays;

import java.util.*;

public class Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    //Defining array
    int number[] = new int[size];

    System.out.println("Enter array elements: ");
    //Taking input
    for (int i = 0; i < size; i++) {
      number[i] = sc.nextInt();
    }
    
    System.out.println("Enter the number: ");
    int x = sc.nextInt();

    //Printing an array
    for (int i = 0; i < number.length; i++) {
      if(number[i]== x){
        System.out.println("x found at index: " + i);
      }
    }
  }
}
