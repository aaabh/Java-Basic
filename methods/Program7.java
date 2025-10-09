package methods;
public class Program7 {

  static char help(){
    return 
    'J';
  }
  static boolean send(){
    return true;
  }
  public static void main(String[] args) {
    char ch = help();
    System.out.println("Return val: "+ch);
    System.out.println("Returned val: " +help());
    boolean isSend = send();
    System.out.println("Return val: "+isSend);
    System.out.println("Returned val: " +send());
    
  }
  
}
