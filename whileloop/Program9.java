package whileloop;

public class Program9 {
  public static void main(String[] args) {
    
    int a = 1;
    int b = 100;
    int sum = 0;
    while(a<=b){

      sum += (a%2==0)?a:0 ;
      a++;
    }
    System.out.println(sum+" sum of 1 to 5");
    
    
  }
}
