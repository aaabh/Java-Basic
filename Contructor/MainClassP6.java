package Contructor;

public class MainClassP6 {
    public static void main(String[] args) {
        Product p1 = new Product(101, 4500, 4.2);
        System.out.println("pid "+p1.pid+" Price "+p1.price+" rating "+p1.rating);

        Product p2 = new Product(102, 4510, 3.2);
        System.out.println("pid "+p2.pid+" Price "+p2.price+" rating "+p2.rating);
    }
}
class  Product{
    int pid ;
    double price;
    double rating;
    Product(int arg1, double arg2, double arg3){
        pid = arg1;
        price = arg2;
        rating = arg3;
    }
}
