import java.util.Scanner;
class Program4{
  public static void main(String[] args) {
    Scanner sc  = new Scanner (System.in);
    System.out.println("Enter Age");
    int age = sc.nextInt();
    System.out.println("Enter Height");
    double height = sc.nextDouble();
    System.out.println("Enter MArriage");
    boolean marriage = sc.nextBoolean();

    System.out.println("Height "+height);
    System.out.println("Age "+age);
    System.out.println("Marriage "+marriage);
    }
}