import java.util.Scanner;
class Cars{
  String carName,carCompany;
  int carRate;
  Cars(int r,String n,String c){
    carName=n;
    carRate=r;
    carCompany=c;
  }
  void display(){
    System.out.println(carName+" "+carRate+" "+carCompany);
  }
}
class CarDetails{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter car Name");
    String name=s.next();
    System.out.println("enter car company");
    String company=s.next();
    System.out.println("enter car rate");
    int carrate=s.nextInt();
    Cars obj=new Cars(carrate,name,company);
    obj.display();
  }
}