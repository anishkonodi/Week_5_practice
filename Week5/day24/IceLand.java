import java.util.Scanner;
class IceLand{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter number of rows and columns of the grid.");
    int n=s.nextInt();
    System.out.println("enter elements");
    int arr[][]=new int[n][n];
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j]=s.nextInt();
      }
    }
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         if(arr[i][j]!=20&&arr[i][j]>10){
         count=1;
           break;
         }
      }
    }

    if(count==1){
      System.out.println("No");
    }
     else{
          System.out.println("Yes"); 
        }
  }
}