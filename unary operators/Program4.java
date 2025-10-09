import java.util.logging.Logger;

public class Program4 {

  public static void main(String args[]){
    // int a = 5;
    // System.out.println(++a);
    // System.out.println(a);
    // System.out.println();
    
    // int b = 9;
    // System.out.println(--b);
    // System.out.println(b);
    // System.out.println();
    
    // int x = 18;
    // System.out.println(++x);
    // System.out.println(x);
    // System.out.println();
    
    // int y = 16;
    // System.out.println(--y);
    // System.out.println(y);

    
    int a = 11;
    int b = ++a + ++a;
    System.out.println(b+" 11");
    
    int c = 18;
    int d = --c + --c;
    System.out.println(c+" 11");    
    
    int p = 14;
    int q = ++p + ++p + ++p;
    System.out.println(q+" 14");    
    
    int x = 17;
    int y = --x + --x + --x;
    System.out.println(y+" 17");
    
    int  m = 10;
    int n = 14;
    int o = ++m + --n + ++m + --n;
    System.out.println(o+ " 11+ 13+ 12+ 12");

    int u = 13;
    int v = 16;
    int w = --u + ++v + --u + ++v;
    System.out.println(w+ " 12+17+11+18");
    

  }  
}
