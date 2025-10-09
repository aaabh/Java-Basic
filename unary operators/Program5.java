import java.util.logging.Logger;

public class Program5 {
  Logger logger = Logger.getLogger(getClass().getName());
  public void decompiled(){
    logger.info("Logger");
  }
  public static void main(String[] args) {
    int a = 10;
    int b = a++ + ++a;
    System.out.println(b+" 10+12");
    int c = 15;
    int d = --c + c--;
    System.out.println(d+" 14+14");

    int x = 13;
    int y = 16;
    int z = x++ + --y ;
    System.out.println(z+" 13+ 15");
    int p = 10;
    int q = 12;
    int r = p-- + q++ + p++ + q-- ;
    System.out.println(r+" 10+12+9+ 13");


    System.out.println();
    double val = 4.5;
    System.out.println(++val);

    char ch ='a';
    System.out.println(++ch);

    char ch1 ='a';
    System.out.println(1+ch1);



    boolean apple =  true;
    // System.out.println(++apple);

    // System.out.println(++2);

    System.out.println();
   }
}
