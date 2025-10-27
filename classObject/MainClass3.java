package classObject;

public class MainClass3 {
  public static void main(String[] args) {
    Mobile m1 = new Mobile();
    m1.name = "Iphone 17 pro max";;;
    m1.price = 150000.00;
    m1.call();
    m1.message(); 
    Mobile m2 = new Mobile();
    m2.name = "Samsung S24 ultra";
    m2.price = 120000.00;
    m2.call();
    m2.message();
  }

}
class Mobile {
  String name;
  double price;
  void call(){
    System.out.println("Calling "+name);
  }
  void message(){
    System.out.println("Messaging "+price);
  }
}
