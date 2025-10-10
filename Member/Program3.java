package Member;

public class Program3 {
  public static void main(String[] args) {
    System.out.println(Alpha.p);
    System.out.println(Alpha.q);
    Alpha.help();
    Alpha.send();
  }
}
class Alpha{
  static char p = 'a';
  static boolean q = true;
  static void help(){
    System.out.println("Execution of help()");
  }
  static void send(){
    System.out.println("Execution of send()");
  }

}
