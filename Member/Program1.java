package Member;

public class Program1 {
  public static void main(String[] args) {
    System.out.println(Demo.a);
    Demo.test();
  }

}

class Demo {
  static int a = 10;
  static void test(){
    System.out.println("Execution of test()");
  }
  
}