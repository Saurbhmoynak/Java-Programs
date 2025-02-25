package OOPS;

class Student {
  
  String name;
  int age;

  Student(String name,int age) {
    this.name = name;
    this.age = age;
  }

  public void printInfo(String name) {
    System.out.println(name);
  }

  public void printInfo(int age) {
    System.out.println(age);
  }

  public void printInfo(String name,int age) {
    System.out.println(name+" "+age);
  }
}

public class CompileTime {
  public static void main(String[] args) {
    Student s1 = new Student("Saurbh",24);
    s1.printInfo(s1.age);
  }
}
