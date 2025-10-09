public class Program3 {
  public static void main(String[] args) {
    char gender = 's';
    int age = 16;

    if (gender == 'm') {
      if (age >= 21) {
        System.out.println("Eligable Marriage");
      } else {
        System.out.println("Boy underage");
      } 
    } else if(gender == 'f') {
        if (age >= 18) {
          System.out.println("Eligible marriage");
        }
      else {
        System.out.println("Girl underage");
      }
    } else{
      System.out.println("Invalid gender" );
    }
  }
}
