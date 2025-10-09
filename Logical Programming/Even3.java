public class Even3 {
  public static void main(String [] args){
    int num = 13;
    switch(true ? num % 2 : -1){
      case 0: 
        System.out.println("Even");
        break;
      case 1: System.out.println("Odd");
    }
  }  
}
