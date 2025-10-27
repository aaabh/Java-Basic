package Member;

public class Program9 {
    int p;
    double q;
    boolean r;
    {
        p = 12;
        q = 1.4;
        r = true;
    }
    public static void main(String[] args) {
        System.out.println("Started");
        Program9 obj = new Program9();
        System.out.println(obj.p);
        System.out.println(obj.q);
        System.out.println(obj.r);
        System.out.println("Ended");
    }
}
