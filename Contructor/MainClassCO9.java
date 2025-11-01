package Contructor;

public class MainClassCO9 {
    public static void main(String[] args) {
        Sample s1 = new Sample(15);
        Sample s2 = new Sample(15,12,13);
        Sample s3 = new Sample(15,12);
    }
}
class Sample{
    Sample(int a){
        System.out.println("Sample(int)");
    }
    Sample(int a,int b){
        System.out.println("Sample(int,int)");
    }Sample(int a, int b, int c){
        System.out.println("Sample(int,int ,int)");
    }
}
