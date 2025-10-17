// /*  output
// 12345
// 22345
// 33345
// 44445
// 55555
//  */
// package Pattern.Pattern;
// import java.util.Scanner;
// public class Pattern2 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter number of rows");
//     int n = sc.nextInt();
//     int i = 1;
//     while (i <= n) {
//       int j = 1;
//       while (j <= n) {
//         if (j <= i) {
//           System.out.print(i);
//         } else {
//           System.out.print(j);
//         }
//         j++;
//       }
//       System.out.println();
//       i++;
//     }
//     sc.close();
//   }  
// }


public class Pattern2{
  public static void main(String[] args) {
   int n = 5;
   for (int i = 1; i <= n; i++) {
    int start = 1;
    for (int j = 1; j <= n; j++) {
      if (start <= i) {
        System.out.print(i);
      }
      else{
        System.out.print(start);
      }
      start++;
      
    }
    System.out.println();
   } 
  }
}