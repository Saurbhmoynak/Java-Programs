package OOPS;

public class Car {
  String model;
  int year;

  //Default constructor
  public Car() {
    this.model = "Unknown";
    this.year = 0;

  }

  //Parameterized constructor
  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public void display() {
    System.out.println("Model: "+model+", Year: "+year);
  }
  
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.display();

    Car car2 = new Car("Tata", 2024);
    car2.display();
  }
}
