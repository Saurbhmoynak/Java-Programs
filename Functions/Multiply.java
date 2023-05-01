package Functions;

import java.util.*;

public class Multiply {
  public static int calculateProduct(int a, int b) {
    int product = a * b;
    return product;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int product = calculateProduct(a, b);
    System.out.println("The product is " + product);
  }
}
