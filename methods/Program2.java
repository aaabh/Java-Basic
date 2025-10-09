package methods;

public class Program2 {
  static void help(){
    System.out.println("Executation help()......");
  }
  static void disp(){
    System.out.println("Executation disp()......");
  }
  static void run(){
    System.out.println("Executation run()......");
  }

  public static void main(String[] args) {
    System.out.println("Program Start");
    help();
    disp();
    run();
    help();
    System.out.println("Program End");
  }
}
