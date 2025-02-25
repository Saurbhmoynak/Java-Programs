package Recursion;

import java.util.*;

public class Factorial {
  public static int fact(int n) {
    //recursion

    //base case
    if (n == 0) {
      return 1;
    }

    //recursive call/relation
    int fact = n * fact(n - 1);
    return fact;
  }
  public static void main(String args[]) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    System.out.println("Factorial is "+ fact(n));
  }
}
