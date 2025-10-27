package Member;

public class Program8 {
    int a ;
    {
        a = 20;
    }

    public static void main(String[] args) {
        System.out.println("Started");
        Program8 ref = new Program8();
        System.out.println(ref.a);
        System.out.println("Ended");
    }
}
/*
St6arted
20
Ended
*/
