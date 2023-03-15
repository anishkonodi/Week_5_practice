class Car{
  String make,name;
  int year,model;

  Car(){
  }
  void display(){
    System.out.println(make+" "+name+" "+year+" "+model);
  }
}

class DefaultConstructor{
  public static void main(String args[]){
    Car obj=new Car();
    obj.display();
  }
}
