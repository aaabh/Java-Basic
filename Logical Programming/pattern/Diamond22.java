package pattern;
/* 
H        H
He      eH
Hel    leH
Hell  lleH
HelloolleH
 */

public class Diamond22 {
  public static void main(String[] args) {
    String str = "Hello";
    int n = str.length();
    int sp = 2*n - 2;
    for(int i = 0; i < n; i++){
      int len = n-i;
      for (int j = 0; j <= i; j++) {
        System.out.print(str.charAt(j));
      }
      for(int j = 0; j < sp; j++){
        System.out.print(" ");
      }
      for (int j = 1; j <= i ; j++) {

        System.out.print(str.charAt(len--));
      }
      System.out.println();
      sp -= 2;
    }
  }
  
}
