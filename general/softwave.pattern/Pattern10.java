/*
output 
1
2  3
5  7  11
13 17 23 31

*/
package softwave.pattern;
public class Pattern10 {

  
  public static void main(String [] args){
    int n = 5;
    // int x = 1;
    for(int i = 1;i<=n;i++){
      // int y = 2;
      for (int j = 2; j < i; j++) {
        if (i%j == 0) {
          System.out.println(j);
        }
        else{
          System.out.println(j);
        }
        /* if(x%y == 0){
          System.out.print(j+" ");
        }  
        else{
          System.out.print(x);
        } 
        x++;
        y++; */
      }
      System.out.println();
    }
}
}



// public class Pattern10 {
  //   public static void main(String[] args) {
//     int n = 5;
//     int next = 2;
//     for(int i = 0; i< n; i++){
//       int iter = 1;
//       for (int j = 1; j <= i; j++) {
//         if(((next-1) % iter) == 0){
//           System.out.print(next+" ");
//         }

//         // else{
//         //   System.out.print(next+"  ");
//         // }
//         next++;
//         iter++;
//       }
//       System.out.println();
//     }

    

//   }
// }
