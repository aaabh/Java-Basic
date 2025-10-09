package softwave.pattern;

/*
1 0 1 0 1 
0 1 0 1
1 0 1
0 1
1 
*/

public class Pattern7 {
  public static void main(String[] args) {
    int n = 5;
    int i = n;
    while(i>=1){
      int j = 1;
      while(j<=i){
        System.out.print((((i+j)%2 == 0)?1:0) +" ");
        j++;
      }
      System.out.println();
      i--;
    }
  }
}
