public class Largest {
  public static void main(String[] args) {
    int a = 100, b= 20, c=10;
    int largest = a;
    if(b>largest){
        largest = b;
    }
    if(c>largest){
        largest = c;
    }
    System.out.println("Largest is: " + largest);
  }  
}
