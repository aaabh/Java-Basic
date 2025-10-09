import java.util.Scanner;

public class Program5 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter your choice: ");
      char alphabet = sc.nextLine().charAt(0);
      alphabet = Character.toLowerCase(alphabet);
      switch(alphabet){
        case 'a':
          System.out.println("Apple");
          break;
        case 'b':
          System.out.println("Ball");
          break;
        case 'c':
          System.out.println("Cat");
          break;  
        case 'd':
          System.out.println("Dog");
          break;
          default:
          System.out.println("Invalid alphabet");
      }
    }
  }  
}
