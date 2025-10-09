import java.util.Scanner;

public class Program3 {

  public static void main(String args[]){
    for(int i = 0; i<5; i++){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your option: ");

    int value = sc.nextInt();
    switch(value){
      case 1: System.out.println("Withdrawal");
      break;
      case 2: System.out.println("Bank Enquiry");
      break;
      case 3: System.out.println("Pin Change");
      break;
      case 4: System.out.println("Mini Statement");
      break;
      default: System.out.println("Invalid option");
    }
  }
  }
}
