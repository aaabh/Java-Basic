package Contructor;

public class MainClassCO11 {
    public static void main(String[] args) {
        Amazon reg = new Amazon();
        Amazon prime = new Amazon(2999.0);
    }
}
class Amazon{
    Amazon(){
        System.out.println("Shopping");
    }
    Amazon(double subscription){
        System.out.println("Shopping");
        System.out.println("Video");
        System.out.println("Music");
    }
}
