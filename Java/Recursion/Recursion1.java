package Recursion;

public class Recursion1 {
  public static int num(int n, int m) {
    if (m == 0) {
      return 1;
    }

    if (n == 0) {
      return 0;
    }
    if (m % 2 == 0) {//even
      return num(n, m / 2) * num(n, m / 2);
    }
    else {
      return num(n, m / 2) * num(n, m / 2) *n;
    }
  }
  public static void main(String[] args) {
    System.out.println(num(3, 2));
  }
}
