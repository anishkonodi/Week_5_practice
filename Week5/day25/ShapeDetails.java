class Shape{
  String colour,filled;
}
class Rectangle extends Shape{
  float width,height;
  float getArea(){
    float Area=width*height;
    return Area;
  }
}

class ShapeDetails{
  public static void main(String args[]){
    Rectangle obj=new Rectangle();
    obj.colour="Black";
    obj.filled="yes";
    obj.width=2;
    obj.height=5;
   float Area=obj.getArea();
    System.out.println(" The area of a rectangle is "+Area);
  }
}