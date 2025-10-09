import java.util.Scanner;
public class Program2 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value");
  int num = sc.nextInt();
  System.out.println(((num & 1) == 0 ? "Even" : "Odd" )+num);  
}
}
