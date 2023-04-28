import java.util.*;

public class ConditionalGreet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int btn = sc.nextInt();

    if (btn == 1)
      System.out.println("Hello");
    else if (btn == 2)
      System.out.println("Namaste");
    else if (btn ==3)
      System.out.println("Bonjour");
    else
      System.out.println("Wrong Choice");
  }
}
