package softwave.pattern;
/* 
12345
1234
123
12
1
 */
public class Pattern2 {
  public static void main(String[] args) {
    int n = 5;
    int i = n;
    while(i>=1){
      int j = 1;
      while(j<=i){
        System.out.print(j);
        j++;
      }
      System.out.println();
      i--;
    }
  }
  
}
