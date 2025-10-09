import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your option: ");

    int option = sc.nextLine().charAt(0) - '0';
    
    switch(option){
      case 1: System.out.println("English");
      break;
      case 2: System.out.println("Hindi");
      break;
      case 3: System.out.println("Kannada");
      break;
      default: System.out.println("Invalid option");
    }
  }  
}
