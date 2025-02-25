import java.util.*;

public class UpdateBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number >> ");
    int n = sc.nextInt();
    int pos = 2;
    System.out.print("Enter the op 0 or 1 >> ");
    int op = sc.nextInt();

    int bitMask = 1 << pos;


    switch (op) {
      case 0:
        int number = (~(bitMask) & n);
        System.out.println("Answer is "+number);
        
        break;
      
      case 1:
        int number2 = (bitMask | n);
        System.out.println("Answer is "+number2);
        
        break;
      
    
      default:System.out.println("Invalid input");
        break;
    }
    
  }
}
