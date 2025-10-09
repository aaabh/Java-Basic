import java.util.Scanner;
public class IsPrime {
  static boolean isPrime(int num){
    if(num <= 1) return false;
    for (int j = 2; j < num; j++) { 
      if(num % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    int num = sc.nextInt();
    System.out.println("Is prime number: "+isPrime(num));
  }
}
