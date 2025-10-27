package classObject;

public class MainClass4 {
  public static void main(String[] args) {
    Bike b1 = new Bike();
    b1.cc = 150;
    b1.mileage = 60.5;
    b1.drive();
    b1.travel();
    
    Bike b2 = new Bike();
    b2.cc = 250;
    b2.mileage = 45.5;
    b2.drive();
    b2.travel();
    
    Bike cafe_Racer = new Bike();
    cafe_Racer.cc = 250;
    cafe_Racer.mileage = 45.5;
    cafe_Racer.drive();
    cafe_Racer.travel();
    
  }
  
}
class Bike{
  int cc;
  double mileage;
  void drive(){
    System.out.println("Driving "+cc);
  }
  void travel(){
    System.out.println("Traveling "+mileage);
  }
}