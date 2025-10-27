package Member;

public class Program6 {
    static int x;
    static {
        x= 10;
    }
    static {
        x= 20;
    }
    static {
        x= 30;
    }

    public static void main(String[] args) {
        System.out.println("Started");
        System.out.println(Program6.x);
        System.out.println("ended");
    }
}
