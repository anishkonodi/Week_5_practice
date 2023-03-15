class Animal {
  String name;
  String color;
  int tailLength;
  int no_of_legs;

  void eat() {
    System.out.println("eating......");
  }
}

class Dog extends Animal {
  String bread;
  String type_of_dog;
  void bark() {
    System.out.println("barking......");
  }
  void displayProperties() {
    System.out.println(name + " " + color + " " + tailLength + " " + no_of_legs + " " + bread + " " + type_of_dog);
  }
}

class BabyDog extends Dog {
  int age;
  void weep(){
    System.out.println("weeping......");
  }
}
public class MultiLevel {
  public static void main(String args[]) {
    BabyDog dog = new BabyDog();
    dog.name = "tonny";
    dog.color = "white";
    dog.no_of_legs = 4;
    dog.tailLength = 2;
    dog.bread = "German Shepard";
    dog.type_of_dog = "petdog";
    dog.displayProperties();
    dog.eat();
    dog.bark();
    dog.weep();
  }
}