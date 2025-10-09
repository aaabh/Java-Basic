package methods;

public class Program11 {
  static int factorial(int num){
    if(num == 0){
      return 0;
    }
    int fact = 1;

    while(num>=1){
      fact *= num;
      num--;
    }
    return fact;
  }
  
  public static void main(String[] args){
    for(int i = 0; i<=5; i++){
      System.out.println(i+ " Factorial is: "+factorial(i));

    }
  }
}
