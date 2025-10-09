package softwave.pattern;

public class Pattern6 {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    int val ;
    while(i<=n){
      val = i+1;
      int j = 0;
      while (j<n) {
        System.out.print(val++);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
