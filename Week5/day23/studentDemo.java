import java.util.Scanner;

class Student {
  String name, city;
  int rollnum;

  Student(int r, String n, String c) {
    name = n;
    rollnum = r;
    city = c;
  }

  void display() {
    System.out.println(name + " " + city + " " + rollnum);
  }
}

class studentDemo {
  Scanner s = new Scanner(System.in);

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter student Id ")
    Student obj = new Student(s.nextInt(), s.next(), s.next());
    obj.display();
  }
}
