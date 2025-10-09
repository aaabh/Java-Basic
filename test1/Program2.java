public class Program2{
  public static void main(String[] args) {
    int n = 5;
    int i = 0;
    while(i<n){
      int j = 0;
      while(j<n){
        if((i+j)%2 == 0){
          System.out.print(" - ");
        }
        else{
          System.out.print(" + ");
        }
        j++;
      }
      System.out.println();
      i++;

    }

  }
}