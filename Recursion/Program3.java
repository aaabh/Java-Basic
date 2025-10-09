// public class Program1 {
//   static void factorial(int num, int fact){
//     fact*=num;
//     if(num>1){
//       num--;
//       factorial(num,fact);
//     }
//     else{
//       System.out.println("Factorial: "+fact);
//     }
//   }
//   public static void main(String[] args) {
//     factorial(5, 1);
//   }
// }




class Program3{
  static int factorial(int num){
    if(num == 1)
      return 1;
      return num* factorial(num-1);
  }
  public static void main(String[] args) {
    int result = factorial(5);
    System.out.println("Factorial: "+result);
  }
}