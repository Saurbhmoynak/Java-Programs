package OOPS;

class Pen {
  // Properties
  String color;
  String type;

  // Method
  public void write() {
    System.out.println("Writing something");
  }

  public void printColor() {
    System.out.println(this.color);
  }
}

public class This {
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "black";

    Pen pen2 = new Pen();
    pen2.color = "Blue";

    pen1.printColor();
    pen2.printColor();
  }
}
