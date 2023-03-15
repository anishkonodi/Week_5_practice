import java.util.Scanner;
class Car{
  String make,name;
  int year,model;

  Car(){
    // Scanner s=new Scanner(System.in);
    // make=s.next();
    // name=s.next();
    // year=s.nextInt();
    // model=s.nextInt();
  }
  void display(){
    System.out.println(make+" "+name+" "+year+" "+model);
  }
}

class CarDemo{
  Scanner s=new Scanner(System.in);
  public static void main(String args[]){
    Car obj=new Car();
    obj.display();
  }
}
