import java.util.Scanner;

class Account {
  Scanner sc = new Scanner(System.in);
  int accountNo;
  double balance;

  Account(int accountNo, double balance) {
    this.accountNo = accountNo;
    this.balance = balance;
  }

  void withdraw() {
    System.out.println("Enter Amount to withdraw");
    double withdraw = sc.nextDouble();
    balance = balance - withdraw;
    displayBalance();

  }

  void deposit() {
    System.out.println("Enter Amount to deposit");
    double depo = sc.nextDouble();
    balance = balance + depo;
    displayBalance();
  }

  void displayBalance() {
    System.out.println("Balance is " + balance);
  }
}

public class BankAccount {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account number ");
        int accNo = s.nextInt();
        System.out.println("Enter Bank balance");
        double balance = s.nextLong();

        Account ba = new Account(accNo, balance);
      System.out.println("Enter the choice");
      System.out.println("1. Withdraw");
      System.out.println("2. Deposite");
      int choice=s.nextInt();
      switch(choice){
        case 1:{
          ba.withdraw();
          break;
        }
        case 2:{
          ba.deposit();
          break;
        }
      } 
    }
}