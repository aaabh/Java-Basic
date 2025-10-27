package Member;

public class Program4 {
    static int a;
    static {
        a= 12;
    }

    public static void main(String[] args) {
        System.out.println("Process starting");
        System.out.println(Program4.a);
        System.out.println("Process Ending");
    }
}
