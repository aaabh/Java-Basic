package softwave.pattern;

public class Pattern {
  public static void main(String [] args){
    int n = 5;
    int i = 1;
    while(i<=n){
      int j = 1;
      while(j<=n){
        System.out.print(((j<=i)?i:j)+" ");
        j++;
      }
      System.out.println();
      i++;
    } 
  }
  
}
