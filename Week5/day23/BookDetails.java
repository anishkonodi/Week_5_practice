import java.util.Scanner;

class Book {
  String bookName, author;
  int year;

  Book(int y,String n,String a){
    bookName=n;
    author=a;
    year=y;
  }

  void display() {
    System.out.println("The book "+bookName + " is written by  " + author + " and it is Published in the year  " + year+".");
  }
}

class BookDetails {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter book Name");
    String n=s.nextLine();
    System.out.println("enter author name");
    String a=s.nextLine();
    System.out.println("enter year of publication");
    int y=s.nextInt();
    Book obj=new Book(y,n,a);
    obj.display();
  }
}