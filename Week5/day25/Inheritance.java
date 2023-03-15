import java.util.Scanner;
class Animal{
  String name;
  String colour;
  int no_of_legs;
  int lengthOfTail;
  void eat(){
    System.out.println("Eating.....");
    
  }
}

class Dog extends Animal{
  String bread;
  String type_of_dog;
  void bark(){
    System.out.println("Barking.....");
    
  }
  void display(){
    System.out.println(name+" "+colour+" "+no_of_legs+" legs are there and the length of the tail is "+lengthOfTail+" meter . Bread of the dog is "+bread+" type of the dog is "+type_of_dog);
  }
}

class Inheritance{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Dog obj=new Dog();
    System.out.println("Enter animal name");
    obj.name=s.next();
    System.out.println("Enter animal colour");
    obj.colour=s.next();
    System.out.println("Enter animal number of legs");
    obj.no_of_legs=s.nextInt();
    System.out.println("Enter length of the tail");
    obj.lengthOfTail=s.nextInt();
    System.out.println("Enter bread name of the animal");
    obj.bread=s.next();
    System.out.println("Enter type of the animal ");
    obj.type_of_dog=s.next();
    obj.display();
    obj.bark();
    obj.eat();
  }
}