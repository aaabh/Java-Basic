public class Program2 {
  static void display(int a){
    System.out.print(a+" ");
    if(a>0){
      a--;
      display(a);
    }
  }
  public static void main(String[] args) {
    display(5);
  }
}
