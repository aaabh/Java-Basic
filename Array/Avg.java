public class Avg{
  public static void main(String [] args){
    int sum =0;
    int[] arr = {15,10,17,16,18};
    for(int i = 0 ;i< arr.length; i++)
      sum += arr[i];
    System.out.println(sum/arr.length);
  }
}