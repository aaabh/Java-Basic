package softwave.pattern;
/* 
1
12
123
1234
12345
 */
public class Pattern4 {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    while(i<=n){
      int j = 1;
      while(j<=i){
        System.out.print(j);
        j++;
      }
      System.out.println();
      i++;
    }
  }
  
}
