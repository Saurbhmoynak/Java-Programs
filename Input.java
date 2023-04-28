import java.util.*;

public class Input {
  public static void main(String[] args){
    
    //Input - print only word
    Scanner sc1 = new Scanner(System.in);
    String name1 = sc1.next();
    System.out.println(name1);

    //Input - print a full line
    Scanner sc2 = new Scanner(System.in);
    String name2 = sc2.nextLine();
    System.out.println(name2);
  }
}
