package softwave.pattern;
/*
1
21
321
4321
54321
 */
public class Pattern5 {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    int val = 1;
    while(i<=n){
      int j = 1;
      while(j<=i){
        System.out.print(val--);
        j++;
      }
      System.out.println();
      i++;
      val= i;
    }
  }
  
}
