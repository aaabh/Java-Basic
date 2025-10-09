public class Program3 { 
  public static void main(String[] args) {
     int a = 11;
     int b = 17;
     int c = a++ + b-- + a++ + b--;
     System.out.println(a+" "+b+" "+c);
     int e = 20;
     int f = 15;
     int g = e++ + f-- + e++ + f--;
     System.out.println(e+" "+f+" "+g);
     
  }  
}
