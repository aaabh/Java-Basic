import java.util.Scanner;

public class Program4 {
  public static void main(String[] args){
    for (int i = 0; i< 5; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your choice: ");
      int choice = sc.nextInt();
      switch(choice){
      case 1: System.out.println("Excellent");
                break;
       case 2: System.out.println("Good");
              break;
       case 3 : System.out.println("Average");
              break;
        case 4 : System.out.println("Poor");
              break;
        default: System.out.println("Invalid choice");
      }
    }
  }
}
