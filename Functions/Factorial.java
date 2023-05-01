package Functions;

import java.util.*;

public class Factorial {

  public static void factorialNum(int n) {

    if (n < 0) {
      System.out.println("Invalid input");
      return;
    }
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    factorialNum(n);
  }
}
