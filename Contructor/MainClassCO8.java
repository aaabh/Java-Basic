package Contructor;


public class MainClassCO8 {
    public static void main(String[] args) {
        Demo d1 = new Demo(12);
        Demo d2 = new Demo(1.2);
        Demo d3 = new Demo("Abc");
    }
}
class Demo{
    Demo(int x){
        System.out.println("Demo(int)");
    }

    Demo(double x){
        System.out.println("Demo(double)");
    }
    Demo(String x){
        System.out.println("Demo(String)");
    }
}
