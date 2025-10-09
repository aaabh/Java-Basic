

public class Program2 {
  static public void main(String [] args){
    // int x = 17;
    // System.out.println(x++);
    // System.out.println(x++);
    // System.out.println(x);

    // System.out.println();

    // int y = 15;
    // System.out.println(y--);
    // System.out.println(y--);
    // System.out.println(y);


    int p = 7;
    int q = p++ + p++; // 7+8
    System.out.println(q);

    System.err.println("hello");

    int x = 5;
    int s = x--+x--;// 5+4
    System.out.println(s);


    int a= 10; 
    
    int b = a++ + a++ + a++;
    System.out.println(a+"  "+b);

    int c = 15;
    int d = c-- + c-- + c--;
    System.out.println(c+"  "+d); 
  }
}
