package Functions;
import java.util.*;

public class Fuctions {
  public static void printMyName(String name) {
    System.out.println(name); //Printing name
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printMyName(name);//Calling function
  }
}
