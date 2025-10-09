package whileloop;


import java.util.Scanner;

public class Program10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number For factor ");

    int n = sc.nextInt();

    int fact = 1;
    while (n>=1) {
      fact *= n; 
      n--;

    }
    System.out.println(fact+" Factorial");
  }
  
}
