import java.util.Scanner;
class Person{
  int age;
  int year;
  String name,gender;
  int bYear;
  Person(int a,String n,String g,int y){
    name=n;
    age=a;
    gender=g;
    year=y;
    
  }

  void birthYear(){
    bYear=year-age;
    display();
  }
  void display(){
    System.out.println("A person name is "+name+" and gender is "+gender+" and his age is "+age+" born in the year "+bYear);
  }
}

class BirthYear{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the name of the person");
    String n=s.nextLine();
    System.out.println("Enter the gender of the person");
    String g=s.nextLine();
    System.out.println("Enter the age of the person");
    int a=s.nextInt();
    System.out.println("Enter the current year");
    int y=s.nextInt();
    Person obj=new Person(a,n,g,y);
    obj.birthYear();
  }
}