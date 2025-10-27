package Contructor;

public class MainClass3 {
    public static void main(String[] args) {
        Delta obj = new Delta();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
class Delta{
    int a ;
    double b;
    Delta(){
        a= 10;
        b = 10.0;
    }
}
