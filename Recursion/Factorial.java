public class Factorial {
  static long factorial(Long num){
    if(num == 0 || num == 1)
      return 1l;
    return factorial(num - 1)* num;
  }
  
  public static void main(String[] args) {
    long num = 5l;
    long result = factorial(num);
    System.out.println(factorial(num));
    System.out.println(((Object) result).getClass().getSimpleName());

  }
}
