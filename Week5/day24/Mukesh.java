import java.util.Scanner;
class Mukesh{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of stiks");
    int n=s.nextInt();
    System.out.println("enter the length of the stiks");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    
  }
}