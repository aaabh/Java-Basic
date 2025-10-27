package classObject;

public class MainClass7 {
  public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.branch = "CS";
    l1.price = 55000.00;
    l1.compile();
    l1.execute();
    
    Laptop l2 = new Laptop();
    l2.branch = "IT";
    l2.price = 45000.00;
    l2.compile();
    l2.execute();
  }
  
}
class Laptop{
  String branch;
  double price;
  void compile(){
    System.out.println("Compiling "+branch);
  }
  void execute(){
    System.out.println("Executing "+price);
  }

}
