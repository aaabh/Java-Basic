import java.util.Scanner;
public class factorial {
  static int fact(int num ){
    if(num <= 1) return 1;

    return fact(num - 1) * num;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    System.out.println(fact(num));
  }

}
