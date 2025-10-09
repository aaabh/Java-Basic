package softwave.pattern;
/* 
12345
2345
345
45
5
 */

public class Pattern3 {
  public static void main(String[] args) {
    int n = 5;
    int i = n;
    int val = 1;
    while(i>=1){
      int j = 1;
      while(j<=i){
        System.out.print(val++);
        j++;
      }
      System.out.println();
      i--;
      val -=i;
    }
  }
  
}
