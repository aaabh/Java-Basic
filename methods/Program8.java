package methods;

public class Program8 {
  static boolean verify(int num){
    if(num%2 == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    System.out.println("Status : "+verify(12));//true
    System.out.println("Status : "+verify(13));//false
  }
}