
public class Pattern3 {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    while (i <= n) {
      int j = 1;
      while (j<=n) {
        if (j == i) {
          System.out.print(0);
        }
        else{
          System.out.print(j);
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
