public class Smallest {
    public static void main(String[] args) {
        int a = 100, b= 20, c=10;
        int smallest = a;
        if(b<smallest){
            smallest = b;
        }
        if(c<smallest){
            smallest = c;
        }
        System.out.println("Smallest is: " + smallest);
    }
}