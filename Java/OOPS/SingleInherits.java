package OOPS;

class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println(name + " is eating");
  }
}

class Dog extends Animal {
  String breed;

  Dog(String name, String breed) {
    super(name);
    this.breed = breed;
  }

  void bark() {
    System.out.println(name +" is barking");
  }
}

public class SingleInherits {
  public static void main(String[] args) {
    Dog dog = new Dog("Tomy", "Vodafone");

    dog.eat();
    dog.bark();

    System.out.println("Name :" + dog.name);
    System.out.println("Breed:" +dog.breed);
  }
}
