import java.util.Scanner;
class PairsInteger{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=s.nextInt();
    System.out.println("Enter the array elemenys");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int count=0;
    System.out.println("Enter the key element");
    int key=s.nextInt();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int res=arr[i]+arr[j];
        if(res%key==0){
          count=count+1;
        }
      }
    }
    System.out.println("The total pairs are "+count);
  }
}