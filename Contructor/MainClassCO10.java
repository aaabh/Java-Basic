package Contructor;

public class MainClassCO10 {
    public static void main(String[] args) {
        Example e1 = new Example(10,"Java");
        Example e2 = new Example("Java",10);
    }
}
class Example{
    Example(int x, String s){
        System.out.println("Example (int,String)"+"x = " + x + ", s = " + s);
    }
    Example( String s, int x){
        System.out.println("Example (String, int)"+"x = " + x + ", s = " + s);
    }
}