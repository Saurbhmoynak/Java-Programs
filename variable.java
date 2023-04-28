public class variable {
  public static void main(String[] args) {
    //variables

    String name = "Saurbh";
    int a = 10;
    int age = 20;
    double price = 25.25;

    
    //changing value
    // a = 20;
    // name = "Moynak";


    //Error - Type mismatch -Cannot convert int to byte 
    byte var1 = 10;
    byte var2 = 20;
 
    // var1 = var1 + var2;

    int sum = var1 + var2;
    int diff = var1 - var2;

    System.out.println(sum);
    System.out.println(diff);

    //Error - Type mismatch -Cannot convert double to float;

    // float f1 = 5.7;
    // float f2 = 4.7;

    float f1 = 5.7f;
    float f2 = 4.7f;

    System.out.println(f1);
    System.out.println(f2);

    
  }
}
