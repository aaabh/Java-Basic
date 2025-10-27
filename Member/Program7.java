package Member;

public class Program7 {
    static int x;
    static {
        System.out.println("Program7.static initializer");
        x = 10;
    }
    public static void main(String[] args) {
        System.out.println("Started");
        System.out.println(Program7.x);
        System.out.println("ended");
    }
}
/*
*
Program7.static initializer
Started
10
ended
*
* */