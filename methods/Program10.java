package methods;

public class Program10 {
  
  static int square (int num){
    return num * num;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i+" Square is : "+square(i));
    }
  }

}
