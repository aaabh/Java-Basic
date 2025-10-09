public class SumE_O{
  public static void main(String [] args){
    int [] arr = {10,13,14,17,16};
    int esum =0;
    int osum =0;
    for(int i = 0; i< arr.length; i++){
      if((arr[i] & 1) == 0){
        esum += arr[i];
      } else {
        osum += arr[i];
      }
    }
    System.out.println("Even sum: "+esum);
    System.out.println("Odd sum: "+osum);
  }
}