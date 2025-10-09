public class Pattern5{
  
  public static void main(String[] args){
    int n = 5;
    // int count = 0;
    int num = 1;
    for(int i = 1; i<=n; i++){
      int printed = 0;
      while(printed < i){
        if(isPrisme(num) || num == 1){
          System.out.print(num+ " ");
          printed++;
        }
        num++;
      }
      System.out.println();//new line 
    }
    
  }
  
  public static boolean isPrisme(int num){
    if(num<2 ){
      return false;
    }
    for(int i =2 ; i<= Math.sqrt(num); i++){
      if(num%i == 0){
        return false;
      }
    }
    return true;
  }
}