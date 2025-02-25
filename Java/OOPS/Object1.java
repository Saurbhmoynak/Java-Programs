package OOPS;

class Pen {
  //Properties or Data Members
  String color;
  String type;

  public void write() {
    System.out.println("Writing something");
  }
}

public class Object1 {
  public static void main(String[] args) {
    //creating an object
    Pen pen1 = new Pen();
    pen1.color ="Black";
    pen1.type ="ballpoint";

    pen1.write();

  }
}
