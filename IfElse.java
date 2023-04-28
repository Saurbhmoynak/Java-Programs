import java.util.*;
public class IfElse {
  public static void main(String[] args) {
    //Taking an input from user
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (age > 18) {
      System.out.println("Adult");
    }
    else {
      System.out.println("Not adult");
    }

    System.out.println("Check odd and even");


    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("Even number");
    }
    else {
      System.out.println("Odd Number");
    }

  }
}
