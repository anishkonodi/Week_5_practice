//Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".




class Vehicle{
  int year;
  String make,model;
  
}

class Car extends Vehicle{
  String colour;
  int num_doors;
  void get_info(){
    System.out.println("The make of the vehicle is "+make);
    System.out.println("The manufatured year of the vehicle "+year);
    System.out.println("The model of the vehicle "+model);   
    System.out.println("The colour of the car is "+colour);
    System.out.println("The number of doors in the Car is "+num_doors);
  }
}

class SportsCar extends Car{
  void rev_engine(){
    int top_speed;
    System.out.println("Vrooom!!....////");
  }
}

class VehicleDemo{
  public static void main(String args[]){
    SportsCar obj=new SportsCar();
    obj.make="Benz";
    obj.model="m1";
    obj.year=2020;
    obj.colour="White";
    obj.num_doors=4;
    obj.get_info();
    obj.rev_engine();
  }
}