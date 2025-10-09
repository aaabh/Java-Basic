public class Program2 {
  public static void main(String[] args) {
    double accBal = 10000.0;
    int amt = 2;
    if (amt <= accBal) {
      if (amt % 100 == 0) {
        System.out.println("Withdrawal balance");
      } else {
        System.out.println("Invalid Denomination");
      }
    } else {
      System.out.println("Inefficient Balance");
    }
  }  
}
