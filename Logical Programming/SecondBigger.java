public class SecondBigger {
  public static void main(String[] args) {
    int a = 40;
    int b = 30; 
    int c = 20;
    int bigger = a;
    int second;
    if(a > b && a < c) second = a; 
    else if (b>a && b<c || b>c && b<a ) second = b;
    else second = c;

    System.out.println(a+" "+b+c +" "+second);
  }
}
