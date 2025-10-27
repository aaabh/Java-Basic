package classObject;

public class MainClass5 {
  public static void main(String[] args) {
    Account a1 = new Account();
    a1.accNo = 1234567890L;
    a1.accBal = 50000.00;
    a1.withdrawal(10000);
    a1.deposite(20001);
    a1.checkBalance();
    System.err.println("-------------------");
    Account a2 = new Account();
    a2.accNo = 9876543210L;
    a2.accBal = 75000.00;
    a2.withdrawal(100000);
    a2.deposite(250001);
    a2.checkBalance();
    System.err.println("-------------------");
    
    Account a3  = new Account();
    a3.accNo = 987654321L;
    a3.accBal = 2500000.00;
    a3.withdrawal(201);
    a3.deposite(100);
    a3.checkBalance();
    System.err.println("-------------------");
  }
}
class Account {
  long accNo;
  double accBal;
  void withdrawal(double amt){
    accBal-=amt;
    System.out.println("Withdrawing  on "+accNo);
    checkBalance();
  }
  void deposite(double amt){
    accBal+=amt;
    System.out.println("Depositing on"+accNo);
    checkBalance();
  }
  void checkBalance(){
    System.out.println("Checking Balance "+accBal);
  }
}
