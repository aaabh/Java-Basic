package Contructor;

public class MainClass4 {
    public static void main(String[] args) {
        Alpha ref = new Alpha();
        System.out.println(ref.a);
    }
}
class Alpha {
    int a;
    Alpha(){
        System.out.println("Alpha.Alpha Contructors");
        a = 10;
    }
}
