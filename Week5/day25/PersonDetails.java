import java.util.Scanner;

class Person {
  String name, gender, address;
  int age;

  void printDetails() {
    System.out.println("The name of the person is " + name + ", gender is " + gender + ", age is " + age);
  }

  void Address() {
    System.out.println("Address is ");
    System.out.println(address);
  }
}

class Student extends Person {
  double sub1, sub2, sub3;
 double total,average,percentage;
  void Average() {
    total=sub1+sub2+sub3;
    average = total/ 3.0;
    System.out.printf("The average maks of the student " + name + " is : %.2f" + average);
  }

  void Percentage() {
    percentage = (total/300)*100;
    System.out.printf("The percentage of the student " + name + " is: %.2f" + percentage);
  }
}

class PersonDetails {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Student st = new Student();
    st.name = "anish";
    st.age = 22;
    st.gender = "male";
    st.address = "koppa, chikmagaluru, karnataka";
    st.sub1 = 45;
    st.sub2 = 78;
    st.sub3 = 89;
    st.printDetails();
    st.Address();
    st.Average();
    st.Percentage();
  }
}