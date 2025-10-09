package methods;

public class Program3 {
  static void change(){
    System.out.println("Executation change()......");
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

  }

  public static void main(String[] args) {
    System.out.println("Program Start");
    change();
    System.out.println("Program End");
  }
}
