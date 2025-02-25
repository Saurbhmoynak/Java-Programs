import java.util.*;

public class Function {
  public static int sumOfNumbers(int a, int b) {
    int sum = a+b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(sumOfNumbers(a, b));
  }
}
