public class Pattern8 {
  public static void main(String[] args) {
    int n = 5;
    int val = n;
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++ ){
        System.out.print(val--);
      }
      System.out.println();
      val = n;
    } 
  }
}
