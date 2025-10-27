package Contructor;
class Demo{
    int val = 10;
    void test(){
        System.out.println("Demo.test");
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.test();
    }
}
