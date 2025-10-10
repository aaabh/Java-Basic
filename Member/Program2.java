package Member;

public class Program2 {
  public static void main(String[] args) {
    System.out.println(Sample.x);
    System.out.println(Sample.y);
    Sample.disp();
    Sample.play();
  }
}
class Sample{
  static int x = 10;
  static double y = 10.0;
  static void disp(){
    System.out.println("Execution Of disp()");
  }
  static void play(){
    System.out.println("Execution of play()");
  }
}
