public class Program1 {
  public static void main(String[] args) {
    int n = 17;
    if (n%2  == 0) {
      if (n<10) {
        System.out.println("Pani poori");
      } else {
        System.out.println("Sev Poori");
      }
    }
    else{
      if (n<10) {
        System.out.println("Masala Poori");
      } else {
        System.out.println("Bhel poori");        
      }
    }
  }
}
