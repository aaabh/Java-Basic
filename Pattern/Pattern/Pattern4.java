

public class Pattern4 {
  public static void main(String[] args){
    int n = 5;
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n-i; j++){
        // if(i==1){
        //   System.out.print("* ");
        // }
        // else{

          System.out.print(" ");
        // }
      }
      for(int k = 1; k<=i; k++){
        System.out.print(" * ");

      }
      System.out.println();//new line
    }
  }
}


/* 
        *
      * *
    * * *
  * * * *
* * * * *  */
/* 
1
2 3
5 7 11
13 17 19 23 
*/
