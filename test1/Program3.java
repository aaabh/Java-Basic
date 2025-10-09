public class Program3 {
  public static void main (String [] args){
    int n = 5;
    int i = 0;
    while(i<n){
      int j = 0;
      while(j<n){
        if(i == j || i+j == n-1 || i == 0 || i == n-1 ){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
